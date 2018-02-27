import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.List;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Container;


public class RestaurantApp {

	public JFrame frame;
	private JTextField jtxtChicBurger;
	private JTextField jtxtChicBurgerMeal;
	private JTextField jtxtCheeseBurger;
	private JTextField jtxtQty;
	private JTextField jtxtConvert;

	double USD=1.21;
	double CNY=7.81;
	
	//--------Calculator variable-------------	
	     private JTextField textDisplay;
	    double firstnum;
	    double secondnum;
	    double result;
	    String operation;
	    String answer;
	
	    

	/**
	 * Create the application.
	 */
	public RestaurantApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Airport System");
		frame.setBounds(0,0,1000,689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(344, 154, 384, 171);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
	
		
		JLabel lblNewLabel_1 = new JLabel("Chicken Burg");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(26, 6, 130, 32);
		panel.add(lblNewLabel_1);
		
		JLabel lblChickenBurgMeal = new JLabel("Chicken Burg Meal");
		lblChickenBurgMeal.setBounds(26, 37, 130, 32);
		panel.add(lblChickenBurgMeal);
		
		JLabel lblChess = new JLabel("Cheese Burg");
		lblChess.setBounds(26, 69, 103, 32);
		panel.add(lblChess);
		
		jtxtChicBurger = new JTextField();
		jtxtChicBurger.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtChicBurger.setText("0");
		jtxtChicBurger.setBounds(202, 6, 130, 32);
		panel.add(jtxtChicBurger);
		jtxtChicBurger.setColumns(10);
		
		jtxtChicBurgerMeal = new JTextField();
		jtxtChicBurgerMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtChicBurgerMeal.setText("0");
		jtxtChicBurgerMeal.setColumns(10);
		jtxtChicBurgerMeal.setBounds(202, 37, 130, 32);
		panel.add(jtxtChicBurgerMeal);
		
		jtxtCheeseBurger = new JTextField();
		jtxtCheeseBurger.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtCheeseBurger.setText("0");
		jtxtCheeseBurger.setColumns(10);
		jtxtCheeseBurger.setBounds(202, 71, 130, 29);
		panel.add(jtxtCheeseBurger);

		
		JComboBox jCmbDrink = new JComboBox();
		jCmbDrink.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		jCmbDrink.setModel(new DefaultComboBoxModel(new String[] {"Select a drink", "Apple Juice", "Coffee", "Cola"}));
		jCmbDrink.setForeground(Color.BLACK);
		jCmbDrink.setBounds(26, 116, 130, 32);
		panel.add(jCmbDrink);
		
		JLabel lblDrinks = new JLabel("Drinks");
		lblDrinks.setBounds(26, 95, 103, 32);
		panel.add(lblDrinks);
		
		JCheckBox jCDelivery = new JCheckBox("Lounge Service");
		jCDelivery.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		jCDelivery.setBounds(26, 143, 119, 23);
		panel.add(jCDelivery);
		
		jtxtQty = new JTextField();
		jtxtQty.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtQty.setText("0");
		jtxtQty.setColumns(10);
		jtxtQty.setBounds(202, 116, 130, 29);
		panel.add(jtxtQty);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setBounds(202, 95, 103, 32);
		panel.add(lblQty);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(64, 146, 1, 16);
		panel.add(textArea);
		
		JCheckBox jCTax = new JCheckBox("Tax");
		jCTax.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		jCTax.setBounds(202, 143, 119, 23);
		panel.add(jCTax);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(6, 95, 372, 15);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0),1));
	
		panel_1.setBounds(740, 154, 238, 171);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCurrencyConvertor = new JLabel("Currency Convertor");
		lblCurrencyConvertor.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrencyConvertor.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		lblCurrencyConvertor.setBounds(21, 0, 183, 47);
		panel_1.add(lblCurrencyConvertor);
		
		jtxtConvert = new JTextField();
		jtxtConvert.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtConvert.setColumns(10);
		jtxtConvert.setBounds(55, 69, 130, 29);
		panel_1.add(jtxtConvert);
		
		JLabel jlblConvert = new JLabel("");
		jlblConvert.setHorizontalAlignment(SwingConstants.CENTER);
		jlblConvert.setBorder(new LineBorder(new Color(0, 0, 0)));
		jlblConvert.setBounds(41, 100, 147, 24);
		panel_1.add(jlblConvert);
		
		JComboBox jCmbCurrency = new JComboBox();
		jCmbCurrency.setModel(new DefaultComboBoxModel(new String[] {"Choose one...", "USD", "CNY"}));
		jCmbCurrency.setForeground(Color.BLACK);
		jCmbCurrency.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		jCmbCurrency.setBounds(55, 40, 130, 32);
		panel_1.add(jCmbCurrency);
		
		
		//-------------------Convert Button-------------------
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Euros=Double.parseDouble(jtxtConvert.getText());
				if(jCmbCurrency.getSelectedItem().equals("USD")){
					String cConvert=String.format("%.2f $", Euros*USD);
					jlblConvert.setText(cConvert);
					
				}
				
				
				if(jCmbCurrency.getSelectedItem().equals("CNY")){
					String cConvert=String.format("%.2f CNY", Euros*CNY);
					jlblConvert.setText(cConvert);
					
				}
				
			}
		});
		btnNewButton.setBounds(6, 136, 117, 29);
		panel_1.add(btnNewButton);
		
		
		//-----------------------Button Close------------------------------
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtxtConvert.setText(null);
				jlblConvert.setText(null);
				jCmbCurrency.setSelectedItem("Choose one...");
			}
		});
		btnNewButton_1.setBounds(115, 136, 117, 29);
		panel_1.add(btnNewButton_1);
		
		JLabel label = new JLabel(" €");
		label.setBounds(191, 75, 41, 16);
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0),1));
	
		panel_2.setBounds(344, 337, 384, 171);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
		lblCostOfDrinks.setBounds(24, 25, 130, 32);
		panel_2.add(lblCostOfDrinks);
		
		JLabel lblCostOfMeal = new JLabel("Cost of Meal");
		lblCostOfMeal.setBounds(24, 69, 130, 32);
		panel_2.add(lblCostOfMeal);
		
		JLabel lblCostOfDelivery = new JLabel("Cost of Lounge");
		lblCostOfDelivery.setBounds(24, 114, 103, 32);
		panel_2.add(lblCostOfDelivery);
		
		JLabel jlblCostofDrinks = new JLabel("0.00");
		jlblCostofDrinks.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostofDrinks.setBounds(210, 33, 147, 24);
		jlblCostofDrinks.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.add(jlblCostofDrinks);
		
		JLabel jlblCostofMeal = new JLabel("0.00");
		jlblCostofMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostofMeal.setBorder(new LineBorder(new Color(0, 0, 0)));
		jlblCostofMeal.setBounds(210, 77, 147, 24);
		panel_2.add(jlblCostofMeal);
		
		JLabel jlblCostofDelivery = new JLabel("0.00");
		jlblCostofDelivery.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostofDelivery.setBorder(new LineBorder(new Color(0, 0, 0)));
		jlblCostofDelivery.setBounds(210, 122, 147, 24);
		panel_2.add(jlblCostofDelivery);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
	
		panel_3.setBounds(740, 337, 238, 171);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setBounds(22, 23, 103, 32);
		panel_3.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setBounds(22, 67, 94, 32);
		panel_3.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(22, 112, 94, 32);
		panel_3.add(lblTotal);
		
		JLabel jlblTax = new JLabel("0.00");
		jlblTax.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblTax.setBorder(new LineBorder(new Color(0, 0, 0),1));
		jlblTax.setBounds(113, 27, 103, 24);
		panel_3.add(jlblTax);
		
		JLabel jlblSubTotal = new JLabel("0.00");
		jlblSubTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblSubTotal.setBorder(new LineBorder(new Color(0, 0, 0)));
		jlblSubTotal.setBounds(113, 67, 103, 24);
		panel_3.add(jlblSubTotal);
		
		JLabel jlblTotal = new JLabel("0.00");
		jlblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblTotal.setBorder(new LineBorder(new Color(0, 0, 0)));
		jlblTotal.setBounds(113, 116, 103, 24);
		panel_3.add(jlblTotal);
		
		
		JLabel lblNewLabel = new JLabel("Airport Food Sales System");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 40));
		lblNewLabel.setBounds(277, 27, 607, 65);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7.setBounds(344, 547, 632, 74);
		frame.getContentPane().add(panel_7);
		panel_7.setLayout(null);
		
		//Button Total
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//--------Count Chicken Burger Price-------------
				double ChicBuger=Double.parseDouble(jtxtChicBurger.getText());
				double iChicBurger=2.39;
				double Burger;
				Burger=ChicBuger*iChicBurger;
				String pMeal=String.format("%.2f", Burger);
				jlblCostofMeal.setText(pMeal);
				
				//--------Count Chicken Burger Meal Price----------
				double ChicBugerMeal=Double.parseDouble(jtxtChicBurgerMeal.getText());
				double iChicBurgerMeal=4.39;
				double BurgerMeal;
				BurgerMeal=ChicBugerMeal*iChicBurgerMeal;
				String cbMeal=String.format("%.2f", BurgerMeal+Burger);
				jlblCostofMeal.setText(cbMeal);
				
				//------------Count Cheese Burger Price----------------
				double CheeseBurger=Double.parseDouble(jtxtCheeseBurger.getText());
				double CheeseBurgerPrice=3.39;
				double CheeseBurgerMeal;
				CheeseBurgerMeal=CheeseBurgerPrice*CheeseBurger;
				String cheese=String.format("%.2f", CheeseBurgerMeal+ BurgerMeal+Burger);
				jlblCostofMeal.setText(cheese);
				
				//------------Choose Lounge or Not--------------------------
				
				double DeliveryPrice=15.00 ;
				if(jCDelivery.isSelected()){//if Delivery Button is selected
					String pDelivery=String.format("%.2f", DeliveryPrice);
					jlblCostofDelivery.setText(pDelivery);
				}
				
				else{
				
					jlblCostofDelivery.setText("0.00");
			     }
			
			 //--------Count Drinks---------------------------------        
		     double Drinks=Double.parseDouble(jtxtQty.getText());
		     double AppleJiuce=1.99*Drinks;
		     double Coffee=3.1*Drinks;
		     double Cola=2.1*Drinks;
		     
		     if(jCmbDrink.getSelectedItem().equals("Apple Juice")){
		    	 
		    	 String cApple_Jiuce=String.format("%.2f", AppleJiuce);
		    	 jlblCostofDrinks.setText( cApple_Jiuce);
		     }
		     
             if(jCmbDrink.getSelectedItem().equals("Coffee")){
		    	 
		    	 String cCoffee=String.format("%.2f", Coffee);
		    	 jlblCostofDrinks.setText( cCoffee);
		     }
             
             if(jCmbDrink.getSelectedItem().equals("Cola")){
		    	 
		    	 String cCola=String.format("%.2f", Cola);
		    	 jlblCostofDrinks.setText( cCola);
		     }
		     
            if(jCmbDrink.getSelectedItem().equals("Select a drink")){
		    	 
		    	
		    	 jlblCostofDrinks.setText( "0.00");
		     }
            
            //-------------Tax------------------------
             double cTotal1=Double.parseDouble(jlblCostofDrinks.getText());
             double cTotal2=Double.parseDouble(jlblCostofMeal.getText());
             double cTotal3=Double.parseDouble(jlblCostofDelivery.getText());
             double Tax=(cTotal1+cTotal2+cTotal3)/10;
            if(jCTax.isSelected()){
            	String cTax=String.format("%.2f", Tax);
            	jlblTax.setText(cTax);
            }
            
            if(!jCTax.isSelected()){
            	
            	jlblTax.setText("0.00");
            }
            //---------------------SubTotal--------------------
            double SubTotal=(cTotal1+cTotal2+cTotal3);
            String cSubTotal=String.format("%.2f", SubTotal);
            jlblSubTotal.setText(cSubTotal);
          
          //---------------------Total--------------------
            double cTotal4=Double.parseDouble(jlblTax.getText());//tax
            double Total=SubTotal+cTotal4;
            String cTotal=String.format("%.2f", Total);
            jlblTotal.setText(cTotal);
            
            String iTax=String.format("%.2f", cTotal4);
            jlblTax.setText(iTax);
            
            
			
			}
		});
		btnTotal.setBounds(69, 21, 117, 29);
		panel_7.add(btnTotal);
		
		//BUTTON Reset set
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtChicBurger.setText("0");
				jtxtChicBurgerMeal.setText("0");
				jtxtCheeseBurger.setText("0");
				jtxtQty.setText("0");
				jtxtConvert.setText(null);
				
				jCmbDrink.setSelectedItem("Select a drink");
				jCmbCurrency.setSelectedItem("Choose one...");
				
				jlblCostofDrinks.setText("0.00");
				jlblCostofMeal.setText("0.00");
				jlblCostofDelivery.setText("0.00");
				jlblSubTotal.setText("0.00");
				jlblTotal.setText("0.00");
				jlblTax.setText("0.00");
				jlblConvert.setText("0.00");
				
		
			
				
				
			}
		});
		btnReset.setBounds(270, 21, 117, 29);
		panel_7.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		btnExit.setBounds(485, 21, 117, 29);
		panel_7.add(btnExit);
					
					
	//=========================================Calculator======================================================		
	
		
	

		/**
		 * Initialize the contents of the frame.
		 */
	
			textDisplay = new JTextField();
			textDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
			textDisplay.setBounds(81, 180, 210, 40);
			frame.getContentPane().add(textDisplay);
			textDisplay.setColumns(10);
			
			//----------------------Row1-----------------------------
			JButton btn7 = new JButton("7");
			btn7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String Enter=textDisplay.getText()+btn7.getText();
					textDisplay.setText(Enter);
				}
			});
			btn7.setFont(new Font("Lucida Grande", Font.BOLD, 19));
			btn7.setBounds(66, 303, 58, 58);
			frame.getContentPane().add(btn7);
			
			JButton btn8 = new JButton("8");
			btn8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String Enter=textDisplay.getText()+btn8.getText();
					textDisplay.setText(Enter);
				}
			});
			btn8.setFont(new Font("Lucida Grande", Font.BOLD, 19));
			btn8.setBounds(127, 303, 58, 58);
			frame.getContentPane().add(btn8);
			
			JButton btn9 = new JButton("9");
			btn9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String Enter=textDisplay.getText()+btn9.getText();
					textDisplay.setText(Enter);
				}
			});
			btn9.setFont(new Font("Lucida Grande", Font.BOLD, 19));
			btn9.setBounds(189, 303, 58, 58);
			frame.getContentPane().add(btn9);
			
			JButton btnSub = new JButton("-");
			btnSub.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					firstnum=Double.parseDouble(textDisplay.getText());
					operation="-";
					textDisplay.setText("");
				}
			});
			btnSub.setFont(new Font("Lucida Grande", Font.BOLD, 19));
			btnSub.setBounds(246, 303, 58, 58);
			frame.getContentPane().add(btnSub);
			
			//----------------------Row2-----------------------------
					JButton btn4 = new JButton("4");
					btn4.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							String Enter=textDisplay.getText()+btn4.getText();
							textDisplay.setText(Enter);
						}
					});
					btn4.setFont(new Font("Lucida Grande", Font.BOLD, 19));
					btn4.setBounds(66, 373, 58, 58);
					frame.getContentPane().add(btn4);
					
					JButton btn5 = new JButton("5");
					btn5.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							String Enter=textDisplay.getText()+btn5.getText();
							textDisplay.setText(Enter);
						}
					});
					btn5.setFont(new Font("Lucida Grande", Font.BOLD, 19));
					btn5.setBounds(127, 373, 58, 58);
					frame.getContentPane().add(btn5);
					
					JButton btn6 = new JButton("6");
					btn6.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							String Enter=textDisplay.getText()+btn6.getText();
							textDisplay.setText(Enter);
						}
					});
					btn6.setFont(new Font("Lucida Grande", Font.BOLD, 19));
					btn6.setBounds(189, 373, 58, 58);
					frame.getContentPane().add(btn6);
					
					JButton btnMul;
					btnMul = new JButton("*");
					btnMul.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							firstnum=Double.parseDouble(textDisplay.getText());
							operation="*";
							textDisplay.setText("");
						}
					});
					btnMul.setFont(new Font("Lucida Grande", Font.BOLD, 19));
					btnMul.setBounds(246, 373, 58, 58);
					frame.getContentPane().add(btnMul);
					
					//----------------------Row3-----------------------------
					JButton btn1 = new JButton("1");
					btn1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							String Enter=textDisplay.getText()+btn1.getText();
							textDisplay.setText(Enter);
						}
					});
					btn1.setFont(new Font("Lucida Grande", Font.BOLD, 19));
					btn1.setBounds(66, 443, 58, 58);
					frame.getContentPane().add(btn1);
					
					JButton btn2 = new JButton("2");
					btn2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							String Enter=textDisplay.getText()+btn2.getText();
							textDisplay.setText(Enter);
						}
					});
					btn2.setFont(new Font("Lucida Grande", Font.BOLD, 19));
					btn2.setBounds(127, 443, 58, 58);
					frame.getContentPane().add(btn2);
					
					JButton btn3 = new JButton("3");
					btn3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							String Enter=textDisplay.getText()+btn3.getText();
							textDisplay.setText(Enter);
						}
					});
					btn3.setFont(new Font("Lucida Grande", Font.BOLD, 19));
					btn3.setBounds(189, 443, 58, 58);
					frame.getContentPane().add(btn3);
					
					JButton btnLash = new JButton("/");
					btnLash.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							firstnum=Double.parseDouble(textDisplay.getText());
							operation="/";
							textDisplay.setText("");
						}
					});
					btnLash.setFont(new Font("Lucida Grande", Font.BOLD, 19));
					btnLash.setBounds(246, 443, 58, 58);
					frame.getContentPane().add(btnLash);
					
					//----------------------Row4-----------------------------
					JButton btn0 = new JButton("0");
					btn0.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							String Enter=textDisplay.getText()+btn0.getText();
							textDisplay.setText(Enter);
						}
					});
					btn0.setFont(new Font("Lucida Grande", Font.BOLD, 19));
					btn0.setBounds(66, 513, 58, 58);
					frame.getContentPane().add(btn0);
					
					JButton btnDot = new JButton(".");
					btnDot.setFont(new Font("Lucida Grande", Font.BOLD, 19));
					btnDot.setBounds(127, 513, 58, 58);
					frame.getContentPane().add(btnDot);
					
					JButton btnPM = new JButton("+/-");
					btnPM .setFont(new Font("Lucida Grande", Font.BOLD, 19));
					btnPM .setBounds(189, 513, 58, 58);
					frame.getContentPane().add(btnPM );
					
					JButton btnEql = new JButton("=");
					btnEql.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							String answer;
							secondnum=Double.parseDouble(textDisplay.getText());
							if(operation=="+"){
								result=firstnum+secondnum;
								answer=String.format("%.2f",result);
								textDisplay.setText(answer);
							}
							
							else if(operation=="-"){
								result=firstnum-secondnum;
								answer=String.format("%.2f",result);
								textDisplay.setText(answer);
							}
							
							else if(operation=="*"){
								result=firstnum*secondnum;
								answer=String.format("%.2f",result);
								textDisplay.setText(answer);
							}
							
							else if(operation=="/"){
								result=firstnum/secondnum;
								answer=String.format("%.2f",result);
								textDisplay.setText(answer);
							}
							else if(operation=="%"){
								result=firstnum%secondnum;
								answer=String.format("%.2f",result);
								textDisplay.setText(answer);
							}
						}
					});
					btnEql.setFont(new Font("Lucida Grande", Font.BOLD, 19));
					btnEql.setBounds(246, 513, 58, 58);
					frame.getContentPane().add( btnEql);		
					
					JButton btnBackSpace = new JButton("<-");
					btnBackSpace.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							String backspace=null;
							if(textDisplay.getText().length()>0){
								StringBuilder str=new StringBuilder(textDisplay.getText());
								str.deleteCharAt(str.length()-1);
								backspace=str.toString();
								textDisplay.setText(backspace);
								
							}
						}
					});
					btnBackSpace.setFont(new Font("Lucida Grande", Font.BOLD, 19));
					btnBackSpace.setBounds(66, 232, 58, 58);
					frame.getContentPane().add(btnBackSpace);
					
					JButton btnC = new JButton("C");
					btnC.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							textDisplay.setText(null);
						}
					});
					btnC.setFont(new Font("Lucida Grande", Font.BOLD, 19));
					btnC.setBounds(127, 232, 58, 58);
					frame.getContentPane().add(btnC);
					
					JButton button_2 = new JButton("%");
					button_2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							firstnum=Double.parseDouble(textDisplay.getText());
							operation="%";
							textDisplay.setText("");
						}
					});
					button_2.setFont(new Font("Lucida Grande", Font.BOLD, 19));
					button_2.setBounds(189, 232, 58, 58);
					frame.getContentPane().add(button_2);
					
					JButton btnAdd = new JButton("+");
					btnAdd.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							firstnum=Double.parseDouble(textDisplay.getText());
							operation="+";
							textDisplay.setText("");
						}
					});
					btnAdd.setFont(new Font("Lucida Grande", Font.BOLD, 19));
					btnAdd.setBounds(246, 232, 58, 58);
					frame.getContentPane().add(btnAdd);
					
					
				//------------------ADD PIC------------------
					
				
					Icon icon=new ImageIcon("/Users/vin/Documents/workspace/Restaurant/pic2.jpg");
	                JLabel jlblpic=null;
				    jlblpic=new JLabel(icon,JLabel.CENTER);
					jlblpic.setBounds(0, 0, 1043, 695);
					
					frame.getContentPane().add(jlblpic);
				
					//frame.pack();
					frame.setVisible(true);
					
					
				
	}
}//class
