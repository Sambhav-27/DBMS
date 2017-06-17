package Apppackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;


public class StartGUI extends javax.swing.JFrame {
    private Connection con;
    private Statement st,st2;
    private ResultSet rs,rs2,rs3,rs4,rs5,rs6;
    private int pnritr=0;
    private int trainitr=0;
    private int seatitr=0;
    private int fareitr=0;
    private int regitr=0;
    private int logitr=0;
    public StartGUI() {     
        initComponents();
        try{
            DbConnect connect = new DbConnect();
            //Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/projectdb2?"+ "user=root&password=nevergiveup");
            st = con.createStatement();
            st2 = con.createStatement();
        }
        catch(Exception ex){
            System.out.println(ex+"Can not connect");
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        PNRStatus = new javax.swing.JPanel();
        PNR = new javax.swing.JTextField();
        Label = new javax.swing.JLabel();
        Check = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        confirmed = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Waiting = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Trains = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        schedule = new javax.swing.JTextArea();
        Seat = new javax.swing.JPanel();
        From = new javax.swing.JTextField();
        To = new javax.swing.JTextField();
        Date = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Classbox = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        answer = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        Fare = new javax.swing.JPanel();
        From2 = new javax.swing.JTextField();
        To2 = new javax.swing.JTextField();
        trainno2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        classbox2 = new javax.swing.JComboBox();
        answer2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        Register = new javax.swing.JPanel();
        eid = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        phn = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        pswd = new javax.swing.JPasswordField();
        pswd2 = new javax.swing.JPasswordField();
        jButton5 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        Result = new javax.swing.JLabel();
        Login = new javax.swing.JPanel();
        login_email = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        login_password = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        login_res = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PNR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PNRActionPerformed(evt);
            }
        });

        Label.setText("PNR Number 10 digits");

        Check.setText("Check");
        Check.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckMouseClicked(evt);
            }
        });
        Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Confirmed seats");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Seats in waiting list");

        confirmed.setColumns(20);
        confirmed.setRows(5);
        jScrollPane1.setViewportView(confirmed);

        Waiting.setColumns(20);
        Waiting.setRows(5);
        jScrollPane2.setViewportView(Waiting);

        jLabel22.setText("Class");

        jLabel23.setText("Waiting Number");

        jLabel24.setText("Class");

        jLabel25.setText("Seat Number");

        javax.swing.GroupLayout PNRStatusLayout = new javax.swing.GroupLayout(PNRStatus);
        PNRStatus.setLayout(PNRStatusLayout);
        PNRStatusLayout.setHorizontalGroup(
            PNRStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNRStatusLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(PNRStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PNRStatusLayout.createSequentialGroup()
                        .addGroup(PNRStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label)
                            .addGroup(PNRStatusLayout.createSequentialGroup()
                                .addComponent(PNR, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(Check, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PNRStatusLayout.createSequentialGroup()
                                .addGroup(PNRStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PNRStatusLayout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel24)
                                        .addGap(143, 143, 143)
                                        .addComponent(jLabel25)))
                                .addGap(18, 18, 18)
                                .addGroup(PNRStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PNRStatusLayout.createSequentialGroup()
                                        .addGap(202, 202, 202)
                                        .addComponent(jLabel23))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(145, Short.MAX_VALUE))
                    .addGroup(PNRStatusLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(238, 238, 238))
                    .addGroup(PNRStatusLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel22)
                        .addGap(422, 422, 422))))
        );
        PNRStatusLayout.setVerticalGroup(
            PNRStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNRStatusLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Label)
                .addGap(18, 18, 18)
                .addGroup(PNRStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PNR, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Check, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(PNRStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(3, 3, 3)
                .addGroup(PNRStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PNRStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(jLabel25)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PNRStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PNR Status", PNRStatus);

        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel11.setText("From Station");

        jLabel12.setText("To Station");

        jLabel26.setText("Train Number");

        jLabel27.setText("Departimg time from source");

        jLabel28.setText("Arrival time at destination");

        schedule.setColumns(20);
        schedule.setRows(5);
        jScrollPane4.setViewportView(schedule);

        javax.swing.GroupLayout TrainsLayout = new javax.swing.GroupLayout(Trains);
        Trains.setLayout(TrainsLayout);
        TrainsLayout.setHorizontalGroup(
            TrainsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrainsLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(TrainsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TrainsLayout.createSequentialGroup()
                        .addGroup(TrainsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))
                    .addGroup(TrainsLayout.createSequentialGroup()
                        .addGroup(TrainsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(466, Short.MAX_VALUE))
                    .addGroup(TrainsLayout.createSequentialGroup()
                        .addGroup(TrainsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(TrainsLayout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(101, 101, 101)
                                .addComponent(jLabel27)
                                .addGap(131, 131, 131)
                                .addComponent(jLabel28)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        TrainsLayout.setVerticalGroup(
            TrainsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrainsLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(TrainsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TrainsLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TrainsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(TrainsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Trains between Stations", Trains);

        jLabel3.setText("From Station");

        jLabel4.setText("To Station");

        jLabel5.setText("Start Date");

        jLabel6.setText("Class");

        Classbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC 1 tier", "AC 2 tier", "Ac 3 tier", "Sleeper 1 tier", "Sleeper 2 tier" }));
        Classbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassboxActionPerformed(evt);
            }
        });

        answer.setColumns(20);
        answer.setRows(5);
        jScrollPane3.setViewportView(answer);

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel29.setText("Train Number");

        jLabel30.setText("Number of seats");

        javax.swing.GroupLayout SeatLayout = new javax.swing.GroupLayout(Seat);
        Seat.setLayout(SeatLayout);
        SeatLayout.setHorizontalGroup(
            SeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeatLayout.createSequentialGroup()
                .addGroup(SeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SeatLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(SeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Date, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                                .addComponent(From))
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(145, 145, 145)
                        .addGroup(SeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(To)
                            .addComponent(Classbox, 0, 308, Short.MAX_VALUE)))
                    .addGroup(SeatLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SeatLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel29)
                        .addGap(198, 198, 198)
                        .addComponent(jLabel30)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        SeatLayout.setVerticalGroup(
            SeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeatLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(SeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(To, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(From))
                .addGap(25, 25, 25)
                .addGroup(SeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGroup(SeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SeatLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(SeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Date, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addComponent(Classbox))
                        .addGap(25, 25, 25)
                        .addGroup(SeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SeatLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );

        jTabbedPane1.addTab("Seat Availability", Seat);

        jLabel7.setText("From Station");

        jLabel8.setText("To Station");

        jLabel9.setText("Train Number");

        jLabel10.setText("Class");

        classbox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC 1 tier", "AC 2 tier", "Ac 3 tier", "Sleeper 1 tier", "Sleeper 2 tier" }));

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FareLayout = new javax.swing.GroupLayout(Fare);
        Fare.setLayout(FareLayout);
        FareLayout.setHorizontalGroup(
            FareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FareLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(FareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(trainno2, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                        .addComponent(From2))
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(184, 184, 184)
                .addGroup(FareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(classbox2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(To2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FareLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(answer2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        FareLayout.setVerticalGroup(
            FareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FareLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(FareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(FareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(To2, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(From2))
                .addGap(30, 30, 30)
                .addGroup(FareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(FareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trainno2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classbox2))
                .addGap(78, 78, 78)
                .addGroup(FareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(answer2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jTabbedPane1.addTab("Fare Enquiry", Fare);

        jLabel15.setText("First Name");

        jButton5.setText("Submit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel16.setText("Last name");

        jLabel17.setText("Phone Number");

        jLabel18.setText("Date of Birth");

        jLabel19.setText("Email id");

        jLabel20.setText("Choose Password");

        jLabel21.setText("Confirm Password");

        jLabel31.setText("Format: YYYYMMDD");

        Result.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        javax.swing.GroupLayout RegisterLayout = new javax.swing.GroupLayout(Register);
        Register.setLayout(RegisterLayout);
        RegisterLayout.setHorizontalGroup(
            RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel19)
                    .addComponent(jLabel17)
                    .addGroup(RegisterLayout.createSequentialGroup()
                        .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pswd2, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(phn)
                            .addComponent(fname)
                            .addComponent(jLabel15)
                            .addComponent(eid))
                        .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegisterLayout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pswd, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(RegisterLayout.createSequentialGroup()
                                        .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel31))
                                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel20)
                                    .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(RegisterLayout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RegisterLayout.setVerticalGroup(
            RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegisterLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(RegisterLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel31)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pswd, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(eid))
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegisterLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel21))
                    .addGroup(RegisterLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pswd2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Register(for new users)", Register);

        jLabel13.setText("Email Id");

        jLabel14.setText("Password");

        jButton4.setText("Submit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(login_email, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(login_password, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(login_res, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login_email, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login_password, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(login_res, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jTabbedPane1.addTab("Login", Login);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClassboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClassboxActionPerformed

    private void PNRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PNRActionPerformed
        
    }//GEN-LAST:event_PNRActionPerformed

    private void CheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckMouseClicked
       
       if(pnritr!=0){
           confirmed.setText("");
                Waiting.setText("");
       }
       pnritr+=1;
       String pnr = PNR.getText();
       int flag =0;
        try{
            String query ="select * from seats_waiting where pnr =\'" + pnr+ "\';";
            rs = st.executeQuery(query);       
            
            if(!rs.next()){
                System.out.print("Nothing in waiting");
                flag+=1;
            }            
            rs.beforeFirst();            
            while(rs.next()){                
                String c = rs.getString("class");
                String waitno = rs.getString("waitno");
                //System.out.println(c+"---");
                String older = Waiting.getText();
                Waiting.setText(older+c+"\t\t\t"+waitno+"\n");
            }            
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        try{
            String query2 ="select * from seats_confirmed where pnr =\'" + pnr+ "\';";
            rs2 = st.executeQuery(query2);
            if(!rs2.next()){
                System.out.print("Nothing in confirmed");
                flag+=1;
            }
            if(flag==2){
                PNR.setText("PNR entered is wrong");
                confirmed.setText("");
                Waiting.setText("");
            }
            rs2.beforeFirst();
            while(rs2.next()){                
                String c = rs2.getString("class");
                String seatno = rs2.getString("seats_no");
                //System.out.println(c+"---");
                String older = confirmed.getText();
                confirmed.setText(older+c+"\t\t\t"+seatno+"\n");
            }
        }
        catch(Exception ex){
             System.out.println(ex);
        }
       
    }//GEN-LAST:event_CheckMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(trainitr!=0){
           schedule.setText("");                
       }
       trainitr+=1;
       int flag=0;
       String src = jTextField5.getText();
       String des = jTextField6.getText();
       try{
            String q = "select stno from station where stname=\'"+src+"\';";
            rs = st.executeQuery(q);
            if(!rs.next()){
                jTextField5.setText("Incorrect Source name");
                flag+=1;
            }
       }
       catch(Exception ex){
           System.out.println(ex);
       }
       try{
            String q1 = "select stno from station where stname=\'"+des+"\';";
            rs2 = st.executeQuery(q1);
            if(!rs2.next()){
                jTextField6.setText("Incorrect Destination name");
                flag+=1;
            }
       }
       catch(Exception ex){
           System.out.println(ex);
       }
       try{
            String q2 = "select trainno from train where src =(select stno from station where stname=\'"+src+ "\') and des =(select stno from station where stname=\'" +des+"\')";
                     
            rs3 = st.executeQuery(q2);
            if(!rs3.next()){
                if(flag==0)
                schedule.setText("No direct tain exist between specified source and destination");
            }
       }
       catch(Exception ex){
           System.out.println(ex);
       }
       /////////////////////////////
        try{
            String q4 = "select trainno,departuretime from schedule where trainno in (select trainno from train where src =(select stno from station where stname=\'" + src + "\' ) and des =(select stno from station where stname=\'" + des +"\')) and stno=(select stno from station where stname=\'" + src+ "\');";
            String q5 = "select trainno,arrivaltime from schedule where trainno in (select trainno from train where src =(select stno from station where stname=\'" + src + "\' ) and des =(select stno from station where stname=\'" + des +"\')) and stno=(select stno from station where stname=\'" + des+ "\');";
            rs4 = st.executeQuery(q4);       
            rs5 = st2.executeQuery(q5);
                       
                        
            while(rs4.next() && rs5.next()){                
                String trainno = rs4.getString("trainno");
                String dtime = rs4.getString("departuretime");
                String atime = rs5.getString("arrivaltime");
                //System.out.println(c+"---");
                String older = schedule.getText();
                schedule.setText(older+trainno+"\t\t\t"+dtime+"\t\t\t"+atime+"\n");
            }            
        }
        catch(Exception ex){
            System.out.println(ex+"yes");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String c =(String)Classbox.getSelectedItem();
        String clas="ac2seats";
        if(c.equals("AC 1 tier"))
        clas="ac1seats";
        else if(c.equals("AC 2 tier"))
        clas="ac2seats";
        else if(c.equals("AC 3 tier"))
        clas="ac3seats";
        else if(c.equals("Sleeper 1 tier"))
        clas="sleeper1seats";
        else if(c.equals("Sleeper 2 tier"))
        clas="sleeper2seats";
        
        if(seatitr!=0){
           answer.setText("");                
        }
        System.out.println(c);
       seatitr+=1;
       int flag=0;
       String src = From.getText();
       String des = To.getText();
       try{
            String q = "select stno from station where stname=\'"+src+"\';";
            rs = st.executeQuery(q);
            if(!rs.next()){
                From.setText("Incorrect Source name");
                flag+=1;
            }
       }
       catch(Exception ex){
           System.out.println(ex);
       }
       try{
            String q1 = "select stno from station where stname=\'"+des+"\';";
            rs2 = st.executeQuery(q1);
            if(!rs2.next()){
                To.setText("Incorrect Destination name");
                flag+=1;
            }
       }
       catch(Exception ex){
           System.out.println(ex);
       }
       try{
            String q2 = "select trainno from train where src =(select stno from station where stname=\'"+src+ "\') and des =(select stno from station where stname=\'" +des+"\')";
                     
            rs3 = st.executeQuery(q2);
            if(!rs3.next()){
                if(flag==0)
                answer.setText("No direct tain exist between specified source and destination");
            }
       }
       catch(Exception ex){
           System.out.println(ex);
       }
       ///////////////////////////
       try{
           String q4 = "select * from train where src =(select stno from station where stname=\'"+src+ "\') and des =(select stno from station where stname=\'" +des+"\')";
           
            rs4 = st.executeQuery(q4);       
            
                       
                        
            while(rs4.next()){                
                String seats = rs4.getString(clas);
                String trainno = rs4.getString("trainno");
                
                String older = answer.getText();
                answer.setText(older+trainno+"\t\t\t"+seats+"\n");
            }            
        }
        catch(Exception ex){
            System.out.println(ex+"yes");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String c =(String)classbox2.getSelectedItem();
        String trainno = (String)trainno2.getText();
        String clas="ac2seats";
        if(c.equals("AC 1 tier"))
        clas="ac1seats";
        else if(c.equals("AC 2 tier"))
        clas="ac2seats";
        else if(c.equals("AC 3 tier"))
        clas="ac3seats";
        else if(c.equals("Sleeper 1 tier"))
        clas="sleeper1seats";
        else if(c.equals("Sleeper 2 tier"))
        clas="sleeper2seats";
        
        if(fareitr!=0){
           answer2.setText("");                
        }
        System.out.println(c);
       fareitr+=1;
       int flag=0;
       String src = From2.getText();
       String des = To2.getText();
       try{
            String q = "select stno from station where stname=\'"+src+"\';";
            rs = st.executeQuery(q);
            if(!rs.next()){
                From2.setText("Incorrect Source name");
                flag+=1;
            }
       }
       catch(Exception ex){
           System.out.println(ex);
       }
       try{
            String q1 = "select stno from station where stname=\'"+des+"\';";
            rs2 = st.executeQuery(q1);
            if(!rs2.next()){
                To2.setText("Incorrect Destination name");
                flag+=1;
            }
       }
       catch(Exception ex){
           System.out.println(ex);
       }
       try{
          String q2 = "select stno from station where stname=\'"+des+"\';";
            rs3 = st.executeQuery(q2);
            if(!rs3.next()){
                if(flag==0)
                answer2.setText("No direct tain exist between specified source and destination");
            }
       }
       catch(Exception ex){
           System.out.println(ex);
       }
       //////////////////////////////////////
       try{
           String q4  = "select * from fares where src = (select stno from station where stname=\'"+src+"\')" +" and des = (select stno from station where stname=\'"+des+"\')" + " and trainno =\'" + trainno +"\' and class=\'" + clas +"\';";
           //System.out.println(q4);
            rs4 = st.executeQuery(q4);       
               
            while(rs4.next()){                
                String p = rs4.getString("price");             
                answer2.setText(p);
            }            
        }
        catch(Exception ex){
            System.out.println(ex+"yes");
        }
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       String fname2 = (String)fname.getText();
       String lname2 = (String)lname.getText();
       String phn2 = (String)phn.getText();
       String dob2 = (String)dob.getText();
       String eid2 = (String)eid.getText();
       String pswd3 = (String)pswd.getText();
       String pswd4 = (String)pswd2.getText(); 
       int fphn=1;
       int feid=1;
       int fdob=0;
       int fpswd=1;
        
        if(regitr!=0){
           fname.setText("");
           lname.setText("");
           phn.setText("");
           dob.setText("");
           eid.setText("");
           pswd.setText("");
           pswd2.setText("");
           Result.setText("You have been Registered. Stop Clicking again.");
        }
       else{
                  
            //System.out.println(pswd3);
            if (!(phn2.matches("^[0-9]{10}$"))){
                phn.setText("Enter correct phone");
                fphn=0;
                
            }
            try{
                    String q = "select email from user where email=\'"+eid2+"\';";
                    rs = st.executeQuery(q);
                    if(rs.next()){
                        feid=0;
                        eid.setText("Email Already exists");
                    }
                        
                    
            }
            catch(Exception ex){
                   System.out.println(ex);
            }
            if(!pswd3.equals(pswd4)){
                fpswd=0;
                Result.setText("Password not matching");
            }
            if(pswd3.length()==0){
                fpswd=0;
                Result.setText("Password length can't be zero");
            }
            if(dob2.length()==8 && (dob2.charAt(4)=='0' || dob2.charAt(4)=='1')&& (dob2.charAt(6)=='0' || dob2.charAt(6)=='1'|| dob2.charAt(6)=='3')){
                fdob=1;
            }
            else
                dob.setText("Enter Correct dob");
            if(fphn==1 && fdob==1 && feid==1 && fpswd==1){
                try{
                    String q4 =" insert into user (email, dob, phn, fname, lname, password) values (\'" + eid2  +"\'," + dob2 + ",\'" + phn2 + "\', \'" + fname2 +"\', \'" + lname2 + "\', \'" + pswd3 +"\');";
                    //System.out.println(q4);
                     st.executeUpdate(q4);
                     Result.setText("Registration Successful");
                     regitr+=1;
                 }
                 catch(Exception ex){
                     System.out.println(ex+"yes");
                 }
            }
            
       }
       
        
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String logemail=(String)login_email.getText();
        String logpass=(String)login_password.getText();
        
        try
        {
            String q="select * from user where email=\'"+logemail+"\' and password=\'"+logpass+"\';";
            rs=st.executeQuery(q);
            if(rs.next())
            {
                login_res.setText("Login Successful");
                login_email.setText("");
                login_password.setText("");
                String args[]=new String[2];
                args[0]=logemail;
                args[1]=rs.getString("uid");
                AfterLogin.main(args);
                dispose();
            }
            else 
            {
                login_res.setText("Incorrect Id or Password");
                login_email.setText("");
                login_password.setText("");
            }
            
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("N".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartGUI().setVisible(true);
            }
        });
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Check;
    private javax.swing.JComboBox Classbox;
    private javax.swing.JTextField Date;
    private javax.swing.JPanel Fare;
    private javax.swing.JTextField From;
    private javax.swing.JTextField From2;
    private javax.swing.JLabel Label;
    private javax.swing.JPanel Login;
    private javax.swing.JTextField PNR;
    private javax.swing.JPanel PNRStatus;
    private javax.swing.JPanel Register;
    private javax.swing.JLabel Result;
    private javax.swing.JPanel Seat;
    private javax.swing.JTextField To;
    private javax.swing.JTextField To2;
    private javax.swing.JPanel Trains;
    private javax.swing.JTextArea Waiting;
    private javax.swing.JTextArea answer;
    private javax.swing.JTextField answer2;
    private javax.swing.JComboBox classbox2;
    private javax.swing.JTextArea confirmed;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField eid;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField login_email;
    private javax.swing.JPasswordField login_password;
    private javax.swing.JLabel login_res;
    private javax.swing.JTextField phn;
    private javax.swing.JPasswordField pswd;
    private javax.swing.JPasswordField pswd2;
    private javax.swing.JTextArea schedule;
    private javax.swing.JTextField trainno2;
    // End of variables declaration//GEN-END:variables
}
