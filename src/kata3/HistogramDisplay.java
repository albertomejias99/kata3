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
    private final Histogram<String> histogram;
    public HistogramDisplay(String title, Histogram histogram){
        super(title);
        this.histogram = histogram;
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
        for (String key : histogram.keySet()) {
            dataset.addValue(histogram.get(key),"",key);
        }        
        return dataset;
    }
    
    public void execute(){
        this.setVisible(true);
    }
}
