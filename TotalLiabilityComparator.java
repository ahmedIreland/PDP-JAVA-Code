import java.util.Comparator;

public class TotalLiabilityComparator implements Comparator<ReportData> {

    @Override
    public int compare(ReportData reportData1, ReportData reportData2) {
        return Double.compare(reportData2.getTotalLiability(), reportData1.getTotalLiability());
    }


}
