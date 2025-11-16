import javax.swing.*;
import java.awt.*;

public class PrintTicket1 extends JFrame {
	public PrintTicket1(
			String sFrom, String sTo, String sClass,
			int iAdult, int iChildren, int iInfant,
			String sBookingDate, int iPrice, String sTime
	) {
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		JPanel Panel2 = new JPanel(null);
		Panel2.setPreferredSize(new Dimension(500, 400));

		JLabel LTitle = new JLabel(
				"<html><b><font color=\"#C71585\" size=\"7\">AirLine Ticket</font></b></html>"
		);
		LTitle.setBounds(150, 10, 400, 40);

		JLabel LFrom = new JLabel(
				"<html><b><font color=\"#000000\">From : </font></b>"
						+ "<font color=\"#778899\">" + sFrom + "</font></html>"
		);
		LFrom.setBounds(50, 60, 300, 20);

		JLabel LTo = new JLabel(
				"<html><b><font color=\"#000000\">To : </font></b>"
						+ "<font color=\"#778899\">" + sTo + "</font></html>"
		);
		LTo.setBounds(50, 90, 300, 20);

		JLabel LClass = new JLabel(
				"<html><b><font color=\"#000000\">Class : </font></b>"
						+ "<font color=\"#778899\">" + sClass + "</font></html>"
		);
		LClass.setBounds(50, 120, 300, 20);

		JLabel LAdult = new JLabel(
				"<html><b><font color=\"#000000\">Adults : </font></b>"
						+ "<font color=\"#778899\">" + iAdult + "</font></html>"
		);
		LAdult.setBounds(50, 150, 300, 20);

		JLabel LChildren = new JLabel(
				"<html><b><font color=\"#000000\">Children : </font></b>"
						+ "<font color=\"#778899\">" + iChildren + "</font></html>"
		);
		LChildren.setBounds(50, 180, 300, 20);

		JLabel LInfant = new JLabel(
				"<html><b><font color=\"#000000\">Infants : </font></b>"
						+ "<font color=\"#778899\">" + iInfant + "</font></html>"
		);
		LInfant.setBounds(50, 210, 300, 20);

		JLabel LDate = new JLabel(
				"<html><b><font color=\"#000000\">Date : </font></b>"
						+ "<font color=\"#778899\">" + sBookingDate + "</font></html>"
		);
		LDate.setBounds(50, 240, 300, 20);

		JLabel LPrice = new JLabel(
				"<html><b><font color=\"#000000\">Price : </font></b>"
						+ "<font color=\"#778899\">" + iPrice + "</font></html>"
		);
		LPrice.setBounds(50, 270, 300, 20);

		JLabel LTime = new JLabel(
				"<html><b><font color=\"#000000\">Time : </font></b>"
						+ "<font color=\"#778899\">" + sTime + "</font></html>"
		);
		LTime.setBounds(50, 300, 300, 20);

		// ✅ Fixed lines 88–91
		JLabel LDev1 = new JLabel("Yugesh Verma");
		JLabel LDev2 = new JLabel("Gopi Pal");
		JLabel LDev3 = new JLabel("Neeraj");
		JLabel LDev4 = new JLabel("Sunil");

		LDev1.setBounds(400, 60, 200, 20);
		LDev2.setBounds(400, 90, 200, 20);
		LDev3.setBounds(400, 120, 200, 20);
		LDev4.setBounds(400, 150, 200, 20);

		// Add components
		Panel2.add(LTitle);
		Panel2.add(LFrom);
		Panel2.add(LTo);
		Panel2.add(LClass);
		Panel2.add(LAdult);
		Panel2.add(LChildren);
		Panel2.add(LInfant);
		Panel2.add(LDate);
		Panel2.add(LPrice);
		Panel2.add(LTime);

		Panel2.add(LDev1);
		Panel2.add(LDev2);
		Panel2.add(LDev3);
		Panel2.add(LDev4);

		c.add(Panel2, BorderLayout.CENTER);

		setTitle("Airline Ticket");
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
}