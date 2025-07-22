import javax.swing.*;
import java.awt.*;

public class SimpleBarChart extends JFrame {

    private final int[] data = {50, 80, 120};

    public SimpleBarChart() {
        setTitle("Simple Bar Chart");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel chartPanel = new JPanel();
        chartPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        chartPanel.setBackground(Color.white);

        for (int barHeight : data) {
            JPanel bar = new JPanel();
            bar.setPreferredSize(new Dimension(50, barHeight));
            bar.setBackground(Color.blue);

            chartPanel.add(bar);
        }

        add(chartPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SimpleBarChart::new);
    }
}