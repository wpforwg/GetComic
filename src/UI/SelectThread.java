package UI;

import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class SelectThread extends JComboBox<String>{
	
	public SelectThread()
	{
		this.addItem("4�߳�");
		this.addItem("8�߳�");
		this.addItem("16�߳�(�Ƽ�)");
		this.addItem("32�߳�(����)");
		this.setSelectedIndex(2);
	}
}