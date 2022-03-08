/*
 * Created by JFormDesigner on Wed Feb 16 15:57:33 CET 2022
 */

package ch.heg.ig;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.formdev.flatlaf.*;


/**
 * @author Vincent Chassot
 */
public class Associations extends JFrame {
  public Associations() {
    initComponents();
    //ligne en dessous rajoutée manuellement
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  }

  private void initComponents() {
    // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - Vinz Chass
    dialogPane = new JPanel();
    contentPanel = new JPanel();
    nomRoleDroite = new JTextField();
    fieldNature = new JComboBox();
    panelEntityGauche = new JPanel();
    entity = new JLabel();
    fieldEntityNameLeft = new JLabel();
    panel14 = new JPanel();
    fieldFromMulti = new JComboBox();
    panelEntity2 = new JPanel();
    fieldEntityRight = new JLabel();
    fieldEntityNameRight = new JLabel();
    separator1 = new JSeparator();
    fieldName = new JTextField();
    fieldFromRoleName = new JTextField();
    fieldToMulti = new JComboBox();
    panelEntiteParentLeft = new JPanel();
    entite_parent_gauche = new JLabel();
    checkBoxParentGauche = new JCheckBox();
    panelOrderedLeft = new JPanel();
    fieldOrderedLeft = new JCheckBox();
    panelOrderedRight = new JPanel();
    label6 = new JLabel();
    fieldOrderedRight = new JCheckBox();
    PanelEntiteParentRight = new JPanel();
    fieldEntiyParentRight = new JCheckBox();
    label5 = new JLabel();
    panelProprietes = new JPanel();
    labelDeleteCascade = new JLabel();
    fieldDeleteCascade = new JCheckBox();
    labelFrozen = new JLabel();
    fieldFrozen = new JCheckBox();
    labelOriented = new JLabel();
    fieldOriented = new JCheckBox();
    labelNonOriented = new JLabel();
    fieldNonOriented = new JCheckBox();
    panelNomsCourts = new JPanel();
    panel7 = new JPanel();
    label1 = new JLabel();
    labelEntityNameLeft = new JLabel();
    fieldFromRoleShortName = new JTextField();
    panel8 = new JPanel();
    labelAssoShortName = new JLabel();
    fieldShortName = new JTextField();
    panel9 = new JPanel();
    label11 = new JLabel();
    labelEntityNameRight = new JLabel();
    fieldToRoleShortName = new JTextField();
    panelExplications = new JPanel();
    scrollPaneExplications = new JScrollPane();
    textAreaExplications = new JTextArea();
    panelErreurs = new JPanel();
    scrollPaneErreurs = new JScrollPane();
    textAreaErreurs = new JTextArea();
    panelButtonAnnuler = new JPanel();
    buttonAnnuler = new JButton();
    panelButtonOkFermerAppl = new JPanel();
    buttonOk = new JButton();
    buttonFermer = new JButton();
    buttonAppliquer = new JButton();

    //======== this ========
    setTitle("Propri\u00e9t\u00e9s de l'association");
    var contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout());

    //======== dialogPane ========
    {
      dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
      dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border
      .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing .border . TitledBorder. CENTER ,javax
      . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,
      12 ) ,java . awt. Color .red ) ,dialogPane. getBorder () ) ); dialogPane. addPropertyChangeListener( new java. beans
      .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r" .equals ( e.
      getPropertyName () ) )throw new RuntimeException( ) ;} } );
      dialogPane.setLayout(new BorderLayout());

      //======== contentPanel ========
      {
        contentPanel.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPanel.getLayout()).columnWidths = new int[] {25, 165, 155, 148, 155, 165, 20, 0};
        ((GridBagLayout)contentPanel.getLayout()).rowHeights = new int[] {0, 32, 32, 11, 32, 32, 32, 12, 73, 91, 115, 115, 0, 0};
        ((GridBagLayout)contentPanel.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)contentPanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- nomRoleDroite ----
        nomRoleDroite.setToolTipText("Nom du r\u00f4le (se lit depuis l'entit\u00e9 de droite)");
        contentPanel.add(nomRoleDroite, new GridBagConstraints(4, 1, 1, 1, 0.0, 0.0,
          GridBagConstraints.CENTER, GridBagConstraints.BOTH,
          new Insets(0, 0, 5, 5), 0, 0));

        //---- fieldNature ----
        fieldNature.setToolTipText("Nature de l'association");
        contentPanel.add(fieldNature, new GridBagConstraints(3, 2, 1, 1, 0.0, 0.0,
          GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
          new Insets(0, 0, 5, 5), 0, 0));

        //======== panelEntityGauche ========
        {
          panelEntityGauche.setBorder(new LineBorder(Color.black, 3));
          panelEntityGauche.setBackground(new Color(0, 102, 255));
          panelEntityGauche.setLayout(new GridBagLayout());
          ((GridBagLayout)panelEntityGauche.getLayout()).columnWidths = new int[] {0, 0};
          ((GridBagLayout)panelEntityGauche.getLayout()).rowHeights = new int[] {70, 64, 0};
          ((GridBagLayout)panelEntityGauche.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
          ((GridBagLayout)panelEntityGauche.getLayout()).rowWeights = new double[] {0.0, 1.0, 1.0E-4};

          //---- entity ----
          entity.setText("<<Entity>>");
          entity.setHorizontalAlignment(SwingConstants.CENTER);
          entity.setVerticalAlignment(SwingConstants.BOTTOM);
          panelEntityGauche.add(entity, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));

          //---- fieldEntityNameLeft ----
          fieldEntityNameLeft.setText("Etudiant");
          fieldEntityNameLeft.setVerticalAlignment(SwingConstants.TOP);
          fieldEntityNameLeft.setHorizontalAlignment(SwingConstants.CENTER);
          panelEntityGauche.add(fieldEntityNameLeft, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPanel.add(panelEntityGauche, new GridBagConstraints(1, 1, 1, 5, 0.0, 0.0,
          GridBagConstraints.CENTER, GridBagConstraints.BOTH,
          new Insets(0, 0, 5, 5), 0, 0));

        //======== panel14 ========
        {
          panel14.setLayout(new BoxLayout(panel14, BoxLayout.X_AXIS));

          //---- fieldFromMulti ----
          fieldFromMulti.setToolTipText("Cardinalit\u00e9 depuis la droite vers la gauche");
          panel14.add(fieldFromMulti);
        }
        contentPanel.add(panel14, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
          GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
          new Insets(0, 0, 5, 5), 0, 0));

        //======== panelEntity2 ========
        {
          panelEntity2.setBorder(new LineBorder(Color.black, 3));
          panelEntity2.setBackground(new Color(0, 102, 255));
          panelEntity2.setLayout(new GridBagLayout());
          ((GridBagLayout)panelEntity2.getLayout()).columnWidths = new int[] {158, 0};
          ((GridBagLayout)panelEntity2.getLayout()).rowHeights = new int[] {75, 45, 0};
          ((GridBagLayout)panelEntity2.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
          ((GridBagLayout)panelEntity2.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

          //---- fieldEntityRight ----
          fieldEntityRight.setText("<<Entity>>");
          fieldEntityRight.setHorizontalAlignment(SwingConstants.CENTER);
          fieldEntityRight.setVerticalAlignment(SwingConstants.BOTTOM);
          panelEntity2.add(fieldEntityRight, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));

          //---- fieldEntityNameRight ----
          fieldEntityNameRight.setText("Cours");
          fieldEntityNameRight.setHorizontalAlignment(SwingConstants.CENTER);
          fieldEntityNameRight.setVerticalAlignment(SwingConstants.TOP);
          panelEntity2.add(fieldEntityNameRight, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPanel.add(panelEntity2, new GridBagConstraints(5, 1, 1, 5, 0.0, 0.0,
          GridBagConstraints.CENTER, GridBagConstraints.BOTH,
          new Insets(0, 0, 5, 5), 0, 0));

        //---- separator1 ----
        separator1.setForeground(Color.black);
        contentPanel.add(separator1, new GridBagConstraints(2, 3, 3, 1, 0.0, 0.0,
          GridBagConstraints.CENTER, GridBagConstraints.BOTH,
          new Insets(0, 0, 5, 5), 0, 0));

        //---- fieldName ----
        fieldName.setToolTipText("Nom de l'association");
        contentPanel.add(fieldName, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.0,
          GridBagConstraints.CENTER, GridBagConstraints.BOTH,
          new Insets(0, 0, 5, 5), 0, 0));

        //---- fieldFromRoleName ----
        fieldFromRoleName.setToolTipText("nom du r\u00f4le (se lit depuis l'entit\u00e9 de gauche)");
        contentPanel.add(fieldFromRoleName, new GridBagConstraints(2, 5, 1, 1, 0.0, 0.0,
          GridBagConstraints.CENTER, GridBagConstraints.BOTH,
          new Insets(0, 0, 5, 5), 0, 0));

        //---- fieldToMulti ----
        fieldToMulti.setToolTipText("Cardinalit\u00e9 depuis la gauche vers la droite");
        contentPanel.add(fieldToMulti, new GridBagConstraints(4, 5, 1, 1, 0.0, 0.0,
          GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
          new Insets(0, 0, 5, 5), 0, 0));

        //======== panelEntiteParentLeft ========
        {
          panelEntiteParentLeft.setBorder(LineBorder.createBlackLineBorder());
          panelEntiteParentLeft.setLayout(new GridBagLayout());
          ((GridBagLayout)panelEntiteParentLeft.getLayout()).columnWidths = new int[] {104, 32, 0};
          ((GridBagLayout)panelEntiteParentLeft.getLayout()).rowHeights = new int[] {25, 0};
          ((GridBagLayout)panelEntiteParentLeft.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
          ((GridBagLayout)panelEntiteParentLeft.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

          //---- entite_parent_gauche ----
          entite_parent_gauche.setText("Entit\u00e9 parent");
          entite_parent_gauche.setHorizontalAlignment(SwingConstants.CENTER);
          panelEntiteParentLeft.add(entite_parent_gauche, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 5), 0, 0));

          //---- checkBoxParentGauche ----
          checkBoxParentGauche.setHorizontalAlignment(SwingConstants.CENTER);
          panelEntiteParentLeft.add(checkBoxParentGauche, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPanel.add(panelEntiteParentLeft, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
          GridBagConstraints.CENTER, GridBagConstraints.BOTH,
          new Insets(0, 0, 5, 5), 0, 0));

        //======== panelOrderedLeft ========
        {
          panelOrderedLeft.setBorder(LineBorder.createBlackLineBorder());
          panelOrderedLeft.setLayout(new GridBagLayout());
          ((GridBagLayout)panelOrderedLeft.getLayout()).columnWidths = new int[] {103, 0};
          ((GridBagLayout)panelOrderedLeft.getLayout()).rowHeights = new int[] {25, 0};
          ((GridBagLayout)panelOrderedLeft.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
          ((GridBagLayout)panelOrderedLeft.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

          //---- fieldOrderedLeft ----
          fieldOrderedLeft.setText("    {ordered}");
          panelOrderedLeft.add(fieldOrderedLeft, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPanel.add(panelOrderedLeft, new GridBagConstraints(2, 6, 1, 1, 0.0, 0.0,
          GridBagConstraints.CENTER, GridBagConstraints.BOTH,
          new Insets(0, 0, 5, 5), 0, 0));

        //======== panelOrderedRight ========
        {
          panelOrderedRight.setBorder(LineBorder.createBlackLineBorder());
          panelOrderedRight.setLayout(new GridBagLayout());
          ((GridBagLayout)panelOrderedRight.getLayout()).columnWidths = new int[] {101, 11, 31, 0};
          ((GridBagLayout)panelOrderedRight.getLayout()).rowHeights = new int[] {25, 0};
          ((GridBagLayout)panelOrderedRight.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
          ((GridBagLayout)panelOrderedRight.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

          //---- label6 ----
          label6.setText("{ordered}");
          label6.setHorizontalAlignment(SwingConstants.RIGHT);
          panelOrderedRight.add(label6, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 5), 0, 0));

          //---- fieldOrderedRight ----
          fieldOrderedRight.setHorizontalAlignment(SwingConstants.CENTER);
          panelOrderedRight.add(fieldOrderedRight, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPanel.add(panelOrderedRight, new GridBagConstraints(4, 6, 1, 1, 0.0, 0.0,
          GridBagConstraints.CENTER, GridBagConstraints.BOTH,
          new Insets(0, 0, 5, 5), 0, 0));

        //======== PanelEntiteParentRight ========
        {
          PanelEntiteParentRight.setBorder(LineBorder.createBlackLineBorder());
          PanelEntiteParentRight.setLayout(new GridBagLayout());
          ((GridBagLayout)PanelEntiteParentRight.getLayout()).columnWidths = new int[] {46, 100, 0};
          ((GridBagLayout)PanelEntiteParentRight.getLayout()).rowHeights = new int[] {25, 0};
          ((GridBagLayout)PanelEntiteParentRight.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
          ((GridBagLayout)PanelEntiteParentRight.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

          //---- fieldEntiyParentRight ----
          fieldEntiyParentRight.setHorizontalAlignment(SwingConstants.CENTER);
          PanelEntiteParentRight.add(fieldEntiyParentRight, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 5), 0, 0));

          //---- label5 ----
          label5.setText("Entit\u00e9 parent");
          label5.setHorizontalAlignment(SwingConstants.CENTER);
          PanelEntiteParentRight.add(label5, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPanel.add(PanelEntiteParentRight, new GridBagConstraints(5, 6, 1, 1, 0.0, 0.0,
          GridBagConstraints.CENTER, GridBagConstraints.BOTH,
          new Insets(0, 0, 5, 5), 0, 0));

        //======== panelProprietes ========
        {
          panelProprietes.setBorder(new TitledBorder(new LineBorder(Color.black, 1, true), "Propri\u00e9t\u00e9s", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION,
            new Font("Segoe UI", Font.BOLD, 12)));
          panelProprietes.setLayout(new GridBagLayout());
          ((GridBagLayout)panelProprietes.getLayout()).columnWidths = new int[] {105, 35, 67, 35, 56, 35, 45, 30, 0};
          ((GridBagLayout)panelProprietes.getLayout()).rowHeights = new int[] {43, 0};
          ((GridBagLayout)panelProprietes.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
          ((GridBagLayout)panelProprietes.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

          //---- labelDeleteCascade ----
          labelDeleteCascade.setText("{deleteCascade}");
          labelDeleteCascade.setHorizontalAlignment(SwingConstants.RIGHT);
          panelProprietes.add(labelDeleteCascade, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 5), 0, 0));

          //---- fieldDeleteCascade ----
          fieldDeleteCascade.setToolTipText("En cas de suppression du parent, l'enfant sera \u00e9galement supprim\u00e9");
          panelProprietes.add(fieldDeleteCascade, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 5), 0, 0));

          //---- labelFrozen ----
          labelFrozen.setText("{frozen}");
          labelFrozen.setHorizontalAlignment(SwingConstants.RIGHT);
          panelProprietes.add(labelFrozen, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 5), 0, 0));
          panelProprietes.add(fieldFrozen, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 5), 0, 0));

          //---- labelOriented ----
          labelOriented.setText("{oriented}");
          labelOriented.setHorizontalAlignment(SwingConstants.RIGHT);
          panelProprietes.add(labelOriented, new GridBagConstraints(4, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 5), 0, 0));
          panelProprietes.add(fieldOriented, new GridBagConstraints(5, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 5), 0, 0));

          //---- labelNonOriented ----
          labelNonOriented.setText("{nonoriented}");
          labelNonOriented.setHorizontalAlignment(SwingConstants.RIGHT);
          panelProprietes.add(labelNonOriented, new GridBagConstraints(6, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 5), 0, 0));
          panelProprietes.add(fieldNonOriented, new GridBagConstraints(7, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPanel.add(panelProprietes, new GridBagConstraints(2, 8, 3, 1, 0.0, 0.0,
          GridBagConstraints.CENTER, GridBagConstraints.BOTH,
          new Insets(0, 0, 5, 5), 0, 0));

        //======== panelNomsCourts ========
        {
          panelNomsCourts.setBorder(new TitledBorder(new LineBorder(Color.black, 1, true), "Noms courts", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION,
            new Font("Segoe UI", Font.BOLD, 12)));
          panelNomsCourts.setLayout(new FlowLayout());

          //======== panel7 ========
          {
            panel7.setLayout(new FlowLayout());

            //---- label1 ----
            label1.setText("R\u00f4le depuis");
            panel7.add(label1);

            //---- labelEntityNameLeft ----
            labelEntityNameLeft.setText("Etudiant");
            panel7.add(labelEntityNameLeft);

            //---- fieldFromRoleShortName ----
            fieldFromRoleShortName.setPreferredSize(new Dimension(130, 30));
            panel7.add(fieldFromRoleShortName);
          }
          panelNomsCourts.add(panel7);

          //======== panel8 ========
          {
            panel8.setLayout(new FlowLayout());

            //---- labelAssoShortName ----
            labelAssoShortName.setText("Association");
            panel8.add(labelAssoShortName);

            //---- fieldShortName ----
            fieldShortName.setPreferredSize(new Dimension(130, 30));
            panel8.add(fieldShortName);
          }
          panelNomsCourts.add(panel8);

          //======== panel9 ========
          {
            panel9.setLayout(new FlowLayout());

            //---- label11 ----
            label11.setText("R\u00f4le depuis");
            panel9.add(label11);

            //---- labelEntityNameRight ----
            labelEntityNameRight.setText("Cours");
            panel9.add(labelEntityNameRight);

            //---- fieldToRoleShortName ----
            fieldToRoleShortName.setMinimumSize(new Dimension(130, 30));
            fieldToRoleShortName.setPreferredSize(new Dimension(130, 30));
            panel9.add(fieldToRoleShortName);
          }
          panelNomsCourts.add(panel9);
        }
        contentPanel.add(panelNomsCourts, new GridBagConstraints(1, 9, 5, 1, 0.0, 0.0,
          GridBagConstraints.CENTER, GridBagConstraints.BOTH,
          new Insets(0, 0, 5, 5), 0, 0));

        //======== panelExplications ========
        {
          panelExplications.setBorder(new TitledBorder(LineBorder.createBlackLineBorder(), "Explications", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION,
            new Font("Segoe UI", Font.BOLD, 12)));
          panelExplications.setLayout(new BoxLayout(panelExplications, BoxLayout.X_AXIS));

          //======== scrollPaneExplications ========
          {
            scrollPaneExplications.setBorder(null);

            //---- textAreaExplications ----
            textAreaExplications.setFont(new Font("Segoe UI", Font.PLAIN, 12));
            textAreaExplications.setText("Etudiant estInscritA 1 ou plusieurs Cours");
            textAreaExplications.setBackground(new Color(242, 242, 242));
            scrollPaneExplications.setViewportView(textAreaExplications);
          }
          panelExplications.add(scrollPaneExplications);
        }
        contentPanel.add(panelExplications, new GridBagConstraints(1, 10, 5, 1, 0.0, 0.0,
          GridBagConstraints.CENTER, GridBagConstraints.BOTH,
          new Insets(0, 0, 5, 5), 0, 0));

        //======== panelErreurs ========
        {
          panelErreurs.setBorder(new TitledBorder(LineBorder.createBlackLineBorder(), "Erreurs", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION,
            new Font("Segoe UI", Font.BOLD, 12)));
          panelErreurs.setLayout(null);

          //======== scrollPaneErreurs ========
          {
            scrollPaneErreurs.setBorder(null);

            //---- textAreaErreurs ----
            textAreaErreurs.setBackground(new Color(242, 242, 242));
            textAreaErreurs.setText("Bravo, il n'y a pas d'erreur");
            textAreaErreurs.setFont(new Font("Segoe UI", Font.PLAIN, 12));
            textAreaErreurs.setEditable(false);
            scrollPaneErreurs.setViewportView(textAreaErreurs);
          }
          panelErreurs.add(scrollPaneErreurs);
          scrollPaneErreurs.setBounds(5, 20, 775, 90);

          {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < panelErreurs.getComponentCount(); i++) {
              Rectangle bounds = panelErreurs.getComponent(i).getBounds();
              preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
              preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = panelErreurs.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            panelErreurs.setMinimumSize(preferredSize);
            panelErreurs.setPreferredSize(preferredSize);
          }
        }
        contentPanel.add(panelErreurs, new GridBagConstraints(1, 11, 5, 1, 0.0, 0.0,
          GridBagConstraints.CENTER, GridBagConstraints.BOTH,
          new Insets(0, 0, 5, 5), 0, 0));

        //======== panelButtonAnnuler ========
        {
          panelButtonAnnuler.setLayout(new FlowLayout(FlowLayout.LEFT));

          //---- buttonAnnuler ----
          buttonAnnuler.setText("Annuler");
          panelButtonAnnuler.add(buttonAnnuler);
        }
        contentPanel.add(panelButtonAnnuler, new GridBagConstraints(1, 12, 1, 1, 0.0, 0.0,
          GridBagConstraints.CENTER, GridBagConstraints.BOTH,
          new Insets(0, 0, 0, 5), 0, 0));

        //======== panelButtonOkFermerAppl ========
        {
          panelButtonOkFermerAppl.setLayout(new FlowLayout());

          //---- buttonOk ----
          buttonOk.setText("Ok");
          panelButtonOkFermerAppl.add(buttonOk);

          //---- buttonFermer ----
          buttonFermer.setText("Fermer");
          panelButtonOkFermerAppl.add(buttonFermer);

          //---- buttonAppliquer ----
          buttonAppliquer.setText("Appliquer");
          panelButtonOkFermerAppl.add(buttonAppliquer);
        }
        contentPanel.add(panelButtonOkFermerAppl, new GridBagConstraints(2, 12, 3, 1, 0.0, 0.0,
          GridBagConstraints.CENTER, GridBagConstraints.BOTH,
          new Insets(0, 0, 0, 5), 0, 0));
      }
      dialogPane.add(contentPanel, BorderLayout.NORTH);
    }
    contentPane.add(dialogPane, BorderLayout.CENTER);
    pack();
    setLocationRelativeTo(getOwner());
    // JFormDesigner - End of component initialization  //GEN-END:initComponents
  }

  // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
  // Generated using JFormDesigner Evaluation license - Vinz Chass
  private JPanel dialogPane;
  private JPanel contentPanel;
  private JTextField nomRoleDroite;
  private JComboBox fieldNature;
  private JPanel panelEntityGauche;
  private JLabel entity;
  private JLabel fieldEntityNameLeft;
  private JPanel panel14;
  private JComboBox fieldFromMulti;
  private JPanel panelEntity2;
  private JLabel fieldEntityRight;
  private JLabel fieldEntityNameRight;
  private JSeparator separator1;
  private JTextField fieldName;
  private JTextField fieldFromRoleName;
  private JComboBox fieldToMulti;
  private JPanel panelEntiteParentLeft;
  private JLabel entite_parent_gauche;
  private JCheckBox checkBoxParentGauche;
  private JPanel panelOrderedLeft;
  private JCheckBox fieldOrderedLeft;
  private JPanel panelOrderedRight;
  private JLabel label6;
  private JCheckBox fieldOrderedRight;
  private JPanel PanelEntiteParentRight;
  private JCheckBox fieldEntiyParentRight;
  private JLabel label5;
  private JPanel panelProprietes;
  private JLabel labelDeleteCascade;
  private JCheckBox fieldDeleteCascade;
  private JLabel labelFrozen;
  private JCheckBox fieldFrozen;
  private JLabel labelOriented;
  private JCheckBox fieldOriented;
  private JLabel labelNonOriented;
  private JCheckBox fieldNonOriented;
  private JPanel panelNomsCourts;
  private JPanel panel7;
  private JLabel label1;
  private JLabel labelEntityNameLeft;
  private JTextField fieldFromRoleShortName;
  private JPanel panel8;
  private JLabel labelAssoShortName;
  private JTextField fieldShortName;
  private JPanel panel9;
  private JLabel label11;
  private JLabel labelEntityNameRight;
  private JTextField fieldToRoleShortName;
  private JPanel panelExplications;
  private JScrollPane scrollPaneExplications;
  private JTextArea textAreaExplications;
  private JPanel panelErreurs;
  private JScrollPane scrollPaneErreurs;
  private JTextArea textAreaErreurs;
  private JPanel panelButtonAnnuler;
  private JButton buttonAnnuler;
  private JPanel panelButtonOkFermerAppl;
  private JButton buttonOk;
  private JButton buttonFermer;
  private JButton buttonAppliquer;
  // JFormDesigner - End of variables declaration  //GEN-END:variables

  public static void main(String[] args) throws Exception {
    //Appliquer un look'n feel -> look plus moderne
    //S'il s'agit d'un des 4 thèmes de base on utilise le setLookAndFeel
    UIManager.setLookAndFeel(new FlatLightLaf());
    //S'il s'agit d'un autre thème, nomDuThème.setup()
    Associations associations = new Associations();
    associations.setVisible(true);
  }
}
