import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ReadDataFromCSV {

    public static void main(String[] args) throws IOException {

    read();
    }

    static void read() throws IOException {
        String  row;
        BufferedReader csvreader = new BufferedReader(new FileReader("/betData.csv"));
        List<BetData > betDataList = new ArrayList<>();

        while ( (row = csvreader.readLine()) !=null ) {
            String [] data =  row.split(",");
            BetData betData = new BetData();
            betData.setBetId(data[0]);
            betData.setBetTimestamp(data[1]);
            betData.setSelectionId(Double.parseDouble(data[2]));
            betData.setSelectionName(data[3]);
            betData.setPrice(Double.parseDouble(data[4]));
            betData.setStake(Double.parseDouble(data[5]));
            betData.setCurrency(data[6]);
            betDataList.add(betData);
        }
        List<ReportData> reportDataList = new ArrayList<>();

        for(BetData betData : betDataList) {

            ReportData reportData = new ReportData();

            reportData.setSelectionName(betData.getSelectionName());
            reportData.setCurrency(betData.getCurrency());
            reportData.setNumBets(betData.getSelectionId());
            reportData.setTotalStakes(betData.getStake());
            reportData.setTotalLiability(betData.getPrice()  * betData.getStake());

            reportDataList.add(reportData);

        }

        reportDataList.sort(new TotalLiabilityComparator());
        for (ReportData reportData1 : reportDataList) {
            System.out.println(reportData1.toString());
        }


        csvreader.close();

    }

}
