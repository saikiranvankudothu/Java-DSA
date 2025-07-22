import javax.swing.*;
import java.awt.*;

public class SimpleBarChart1 extends JFrame {

    private final int[] data = {50, 80, 120};

    public SimpleBarChart1() {
        setTitle("Simple Bar Chart");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel chartPanel = new JPanel();
        chartPanel.setBackground(Color.white);

        for (int barHeight : data) {
            JPanel bar = createBar(barHeight);
            chartPanel.add(bar);
        }

        add(chartPanel);
        setVisible(true);
    }

    private JPanel createBar(int height) {
        JPanel bar = new JPanel();
        bar.setPreferredSize(new Dimension(50, height));
        bar.setBackground(Color.blue);
        return bar;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SimpleBarChart::new);
    }
}