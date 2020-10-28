package kata3;

import java.awt.Container;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{
    
    public HistogramDisplay(String title){
        super(title);
        this.setContentPane(createPanel());
        this.pack();
    }

    private JPanel createPanel() {
        return new ChartPanel(createChart(createDataset()));
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart("JFreeChart Histogram",
                "emails", "nº emails", dataSet, PlotOrientation.VERTICAL,
                false, false, rootPaneCheckingEnabled);
        return chart;
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(5, "", "ulpgc.es");
        dataset.addValue(1, "", "marca.es");
        dataset.addValue(4, "", "google.es");
        dataset.addValue(2, "", "ull.es");
        dataset.addValue(3, "", "youtube.es");
        return dataset;
    }
    
    public void execute(){
        this.setVisible(true);
    }
}
