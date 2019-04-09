package gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseEvent;

public class MyFirstGUIWindow {

	protected Shell Vorname;
	private Text VornameTF;
	private Text PostleitzahlTF;
	private Text OrtTF;
	private Text HausnummerTF;
	private Text StrasseTF;
	private Text NachnameTF;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MyFirstGUIWindow window = new MyFirstGUIWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		Vorname.open();
		Vorname.layout();
		while (!Vorname.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		Vorname = new Shell();
		Vorname.setSize(450, 300);
		Vorname.setText("SWT Application");
		
		Button btnNewButton = new Button(Vorname, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
		System.out.println("Knoppe gedrückt");	
	System.out.println(VornameTF.getText());
	System.out.println(NachnameTF.getText());
	System.out.println(StrasseTF.getText());
	System.out.println(HausnummerTF.getText());
	System.out.println(PostleitzahlTF.getText());		
	System.out.println(OrtTF.getText());	
			
			}
		
		
		
		
		
		
		});
		
		
		btnNewButton.setBounds(10, 19, 75, 170);
		btnNewButton.setText("button");
		
		Label vorname = new Label(Vorname, SWT.NONE);
		vorname.setBounds(133, 24, 55, 15);
		vorname.setText("Vorname");
		
		VornameTF = new Text(Vorname, SWT.BORDER);
		VornameTF.setBounds(216, 21, 76, 21);
		
		Label Postleitzahl = new Label(Vorname, SWT.NONE);
		Postleitzahl.setBounds(133, 142, 55, 15);
		Postleitzahl.setText("PLZ");
		
		PostleitzahlTF = new Text(Vorname, SWT.BORDER);
		PostleitzahlTF.setBounds(216, 139, 76, 21);
		
		Label Strasse = new Label(Vorname, SWT.NONE);
		Strasse.setBounds(133, 85, 55, 15);
		Strasse.setText("Strasse");
		
		Label Nachname = new Label(Vorname, SWT.NONE);
		Nachname.setBounds(133, 56, 55, 15);
		Nachname.setText("Nachname");
		
		Label Hausnummer = new Label(Vorname, SWT.NONE);
		Hausnummer.setBounds(133, 115, 55, 15);
		Hausnummer.setText("Hausnummer");
		
		Label Ort = new Label(Vorname, SWT.NONE);
		Ort.setBounds(133, 174, 55, 15);
		Ort.setText("Ort");
		
		OrtTF = new Text(Vorname, SWT.BORDER);
		OrtTF.setBounds(216, 171, 76, 21);
		
		HausnummerTF = new Text(Vorname, SWT.BORDER);
		HausnummerTF.setBounds(216, 112, 76, 21);
		
		StrasseTF = new Text(Vorname, SWT.BORDER);
		StrasseTF.setBounds(216, 82, 76, 21);
		
		NachnameTF = new Text(Vorname, SWT.BORDER);
		NachnameTF.setBounds(216, 53, 76, 21);
		
		Button gh = new Button(Vorname, SWT.NONE);
		gh.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.exit(0);
			}
		});
		gh.setBounds(349, 24, 75, 165);
		gh.setText("Abbruch");
		
		Composite composite = new Composite(Vorname, SWT.NONE);
		composite.addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(MouseEvent arg0) {
				System.out.println(arg0.x + "/" + arg0.y);
			}
		});
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_GREEN));
		composite.setBounds(104, 187, 64, 64);
		
	}
}
