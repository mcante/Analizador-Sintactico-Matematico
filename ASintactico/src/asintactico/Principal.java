//Melvin Randolfo Canté Guerra
//5990-14-1106
//Proyecto de Compiladores
//Generador de árbol sintáctico de expresiones matemáticas

package asintactico;

import java.awt.Desktop;
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;
//import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.lang.Thread;


/**
 *
 * @author MrCante
 */
public class Principal extends javax.swing.JFrame {

    

    //Declaración de las pilas
    Stack < String > E = new Stack < String > (); //Pila entrada
    Stack < String > P = new Stack < String > (); //Pila temporal para operadores
    Stack < String > S = new Stack < String > (); //Pila salida
    
    String [][] arbol = new String [100][3];
    
    String post =""; //Variable para compartir posfija
    int con=0; //Contador para la matriz
    String grafico = "";

//    public Timer timer;
    
//    public final static int ONE_SECOND = 1000;

    

    
    
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnAnalizar = new javax.swing.JButton();
        TxtEntrada = new javax.swing.JTextField();
        TxtResultado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtResultado3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtGramatica = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        CmbEjemplos = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        LblVisor = new javax.swing.JLabel();
        BtnVerImagen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnAnalizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtnAnalizar.setText("Analizar");
        BtnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnalizarActionPerformed(evt);
            }
        });

        TxtEntrada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtEntrada.setText("(25*3+4-2/1)");

        TxtResultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Expresión matemática");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("PosFija");

        TxtResultado3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Resultado matemático");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Gramática");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("By Melvin Canté");

        TxtGramatica.setColumns(20);
        TxtGramatica.setRows(5);
        jScrollPane1.setViewportView(TxtGramatica);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Árbol Sintáctico");

        CmbEjemplos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CmbEjemplos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1+2", "1+2-3", "(1+3)^2", "(1*2)+(12/4)^3", "(((1+2)^(3/4)*5)+6)/((7/8)^9)" }));
        CmbEjemplos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbEjemplosActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Seleccionar expresión matemática \"mínima\"");

        LblVisor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BtnVerImagen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtnVerImagen.setText("Ver en Visor");
        BtnVerImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerImagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnAnalizar)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4)
                                .addComponent(TxtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                                .addComponent(TxtEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(TxtResultado3, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(123, 123, 123)
                                        .addComponent(jLabel5))
                                    .addComponent(CmbEjemplos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(53, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BtnVerImagen)
                                    .addComponent(LblVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34))))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(457, 457, 457)
                    .addComponent(jLabel6)
                    .addContainerGap(476, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CmbEjemplos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnAnalizar)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(BtnVerImagen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtResultado3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LblVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(171, 171, 171)
                    .addComponent(jLabel6)
                    .addContainerGap(503, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnalizarActionPerformed
        
        //ANTES DE HACER CUALQUIER OPERACIÓN LIMPIAR LOS VALORES DE LAS VARIABLES Y PILAS
        Limpiar();
        //Entrada de datos
        String leer = TxtEntrada.getText();

        //Depurar la expresion algebraica
        String expr = depurar(leer);
            System.out.println("cadena nueva_ " + expr);
        String[] arrayInfix = expr.split(" ");

        //Añadir la array a la Pila de entrada (E)
        for (int i = arrayInfix.length - 1; i >= 0; i--) {
          E.push(arrayInfix[i]);
        }

        try {
            //E: Pila entrada
            //P: Pila temporal para operadores
            //S: Pila salida

            //push: inserta un elemento en la pila
            //pop: retira el elemento que se encuentra en la cima de la pila
            //peek: devuelve el valor del elemento que se encuentra en la cima de la pila
            //empty: devuelve verdadero si la pila está vacía

            //Algoritmo Infijo a Postfijo
            while (!E.isEmpty()) {
              switch (pref(E.peek())){

                  case 1: //(
                  P.push(E.pop());
                  break;

                case 2: // )
                  while(!P.peek().equals("(")) {
                    S.push(P.pop());
                  }
                  P.pop();
                  E.pop();
                  break;

                case 3: // + -
                    while(pref(P.peek()) >= pref(E.peek())) {
                    S.push(P.pop()); //Si es mayor sacarlo de la pila temporal y agregarlo a la pila de salida
                    }
                    P.push(E.pop()); //agregar el nuevo operador a la pila temporal
                    break; 

                case 4: // * /
                  while(pref(P.peek()) >= pref(E.peek())) {
                    S.push(P.pop()); //Si es mayor sacarlo de la pila temporal y agregarlo a la pila de salida
                  }
                  P.push(E.pop()); //agregar el nuevo operador a la pila temporal
                  break;

                case 5: // ^
                    while(pref(P.peek()) >= pref(E.peek())) {
                    S.push(P.pop()); //Si es mayor sacarlo de la pila temporal y agregarlo a la pila de salida
                    }
                    P.push(E.pop()); //agregar el nuevo operador a la pila temporal
                    break; 

                default: //CUALQUIER VALOR QUE NO SEA OPERADOR
                  S.push(E.pop()); 
              } 
            } 

            System.out.println("Estos son los valores de la Pila: " + S.toString());


            //Eliminacion de `impurezas´ en la expresiones algebraicas
            String infix = expr.replace(" ", "");//ELIMINAR LOS ESPACIOS
            System.out.println("antes de replaceall " + expr);
            String postfix = S.toString().replaceAll("[\\]\\[,]", ""); //ELIMINAR CORCHETES Y COMAS DE LA PILA

            //Mostrar resultados:
            System.out.println("Expresion Infija: " + infix);
            System.out.println("Expresion Postfija: " + postfix);
            post=postfix;
            //System.out.println("Expresion Postfija***************: " + post);


            TxtResultado.setText(null);
            TxtResultado3.setText(null);
            TxtResultado.setText(postfix);

            
            generarArbol(); //generar el arbol sintáctico
            
            try {
                evaluarPosFija(); //evaluar expresión matemática
            } catch (Exception e) {
                TxtResultado3.setText("ERROR de semántica, no puede devolverse un valor numérico.");
            }
            
            
            

          }catch(Exception ex){ 
            System.out.println("Error en la expresión algebraica");
            System.err.println(ex);
          }
        
    
    }//GEN-LAST:event_BtnAnalizarActionPerformed

    private void CmbEjemplosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbEjemplosActionPerformed
        TxtEntrada.setText(null);
        TxtEntrada.setText(CmbEjemplos.getSelectedItem() +"");
    }//GEN-LAST:event_CmbEjemplosActionPerformed

    private void BtnVerImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerImagenActionPerformed
        //LA IMAGEN ES LLAMADA CON EL VISOR POR DEFECTO DEL SISTEMA
        try{
            Desktop.getDesktop().open(new File("c:\\Salida\\ArbolSintactico.jpg"));            
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Error al intentar abrir la imagen " + e);
        }
    }//GEN-LAST:event_BtnVerImagenActionPerformed

    
    
    //Depurar expresión algebraica
  private static String depurar(String s) {
    System.out.println("s " + s);
    s = s.replaceAll("\\s+", ""); //Elimina espacios en blanco
    System.out.println("sin espacios s " + s);
    s = "(" + s + ")"; //Añade parentesis a la expresión
    System.out.println("con parentesis s " + s);
    String simbols = "+-*/^()";
    String str = "";
  
    //Deja espacios entre operadores
    for (int i = 0; i < s.length(); i++) {
      if (simbols.contains("" + s.charAt(i))) {
        str += " " + s.charAt(i) + " "; //Si es un simbolo que le coloque espacios y lo agregue a la cadena
      }else{
          str += s.charAt(i); //Si no lo es entonces que sólo se agregue el valor a la cadena
      }
    }
      System.out.println("Nueva s " + str);
    return str.replaceAll("\\s+", " ").trim();
  } 

  //Jerarquia de los operadores
  private static int pref(String op) {
    int prf = 99;
    if (op.equals("^")) prf = 5;
    if (op.equals("*") || op.equals("/")) prf = 4;
    if (op.equals("+") || op.equals("-")) prf = 3;
    if (op.equals(")")) prf = 2;
    if (op.equals("(")) prf = 1;
    return prf;
  }
    
 
  
  
  //EVALUAR EL RESULTADO DE POSFIJA
  private void evaluarPosFija(){   
    
    //Entrada (Expresión en Postfija)
    String expr = post; //Expresión PostFija
    //System.out.println("expr arbol: " + expr);
    String[] post = expr.split(" ");    
    
    
    //Declaración de las pilas
    Stack < String > E = new Stack < String > (); //Pila entrada
    Stack < String > P = new Stack < String > (); //Pila de operandos
    
    //Añadir post (array) a la Pila de entrada (E)
    for (int i = post.length - 1; i >= 0; i--) {
      E.push(post[i]);
      //System.out.println("PREUBA***************: " + post[i]);
    }

    //Algoritmo de Evaluación Postfija
    String operadores = "+-*/^"; 
    while (!E.isEmpty()) {
      if (operadores.contains("" + E.peek())) {
        
            P.push(evaluar(E.pop(), P.pop(), P.pop()) + "");
        
      }else {
        
          //System.out.println("***PREUBA***************: " + P.push(E.pop()));
          P.push(E.pop());
      } 
    }

    //Mostrar resultados:
    //System.out.println("Expresion: " + expr);
    //System.out.println("Resultado: " + P.peek());
    
    TxtResultado3.setText("Resultado: " + P.peek());

  }
  
  
  
  private static double evaluar(String op, String n2, String n1) {
    //System.out.println("PREUBA***************:    num1: " + n1 + " Op: " + op + " num2: " + n2);
    double num1 = Double.parseDouble(n1);
    double num2 = Double.parseDouble(n2);
    
    //System.out.println("num1: " + num1 + " Op: " + op + " num2: " + num2);
    if (op.equals("+")) return (num1 + num2);
    if (op.equals("-")) return (num1 - num2);
    if (op.equals("*")) return (num1 * num2);
    if (op.equals("/")) return (num1 / num2);
    if (op.equals("^")) return Math.pow(num1, num2);
      
    
    return 0;
  }
  
  
  
  
    //GENERAR ARBOL
  private void generarArbol(){   
    
    //Entrada (Expresión en Postfija)
    String expr = post; //Expresión PostFija
    String[] post = expr.split(" ");  
    
    boolean derecha=false;
    
    
    //Declaración de las pilas
    Stack < String > Entrada = new Stack < String > (); //Pila entrada
    Stack < String > elementosP = new Stack < String > (); //Pila entrada, contendrá a posfija en forma de pila
    Stack < String > expresionesP = new Stack < String > (); //Pila de operandos
    
    //Añadir post (array) a la Pila de entrada (Entrada)
    for (int i = post.length - 1; i >= 0; i--) {
      Entrada.push(post[i]);
    }
      System.out.println("Entrada: " + Entrada);

    //Algoritmo para generar Arbol
    String operadores = "+-*/^"; 
    
    String num1 = "";
    String num2 = "";
    String op = "";
    //MIENTRAS LA PILA NO ESTÉ VACÍA
    while (!Entrada.isEmpty()) {
      
        
        //EL ELEMENTO ES UN OPERADOR
        if (operadores.contains("" + Entrada.peek())) {
            System.out.println("Operador encontrado: " +Entrada.peek());
            
            //P.push(evaluar(Entrada.pop(), P.pop(), P.pop()) + "");
            op = Entrada.pop(); ////extraer el operador de la lista
            
            //Verificar el elemento tope de la pila que "sí exista"
            if (!elementosP.isEmpty()) {
                //System.out.println("Emento encontrado " + elementosP.peek());
                num2 = elementosP.pop(); //extraer el elemento de la pila y asignarlo al lado derecho
                
                //verifica si existe otro elemento en la pila para asignarlo al lado izquierdo
                if (!elementosP.isEmpty()) {
                    num1 = elementosP.pop(); //extraer el elemento de la pila y asignarlo al lado izquierdo
                    arbol[con][0] = num1;
                    arbol[con][1] = tipoOperador(op) + con;
                    arbol[con][2] = num2;
                    expresionesP.push(arbol[con][1]); //Apilar las expresiones
                    System.out.println("________________________________________________");
                    System.out.println("elemento, operador y elemento");
                    System.out.println("izq " + num1 + " op " + expresionesP.peek() + " derecha " + num2);
                    
                } else {
                    if (!expresionesP.isEmpty()) {
                        num1 = expresionesP.pop();
                        arbol[con][0] = num1;
                        arbol[con][1] = tipoOperador(op) + con;
                        arbol[con][2] = num2;
                        expresionesP.push(arbol[con][1]); //Apilar las expresiones
                        
                        System.out.println("________________________________________________");
                        System.out.println("expresion, operador y elemento");
                        System.out.println("izq " + num1 + " op " + expresionesP.peek() + " derecha " + num2);
                    }
                }
            } else { //SINO HAY ELMENTOS EN LA LISTA ENTONCES SON EXPRESIONES
                System.out.println("error encontrado?");
                if (expresionesP.peek() != null) {
                    num2 = expresionesP.pop();
                    if (expresionesP.peek() != null) { //VERIFICAR SI HAY OTRA EXPRESIÓN PARA ASIGNARLA
                        num1 = expresionesP.pop();
                        arbol[con][0] = num1;
                        arbol[con][1] = tipoOperador(op) + con;
                        arbol[con][2] = num2;
                        expresionesP.push(arbol[con][1]); //Apilar las expresiones
                        
                        System.out.println("________________________________________________");
                        System.out.println("expresion, operador y expresion");
                        System.out.println("izq " + num1 + " op " + expresionesP.peek() + " derecha " + num2);
                    }
                }
            }
              
              con++;

        }else { //SINO ES OPERADOR ENTONCES ES UN DÍGITO
            elementosP.push(Entrada.pop());
            System.out.println("Ementos Pendientes: " + elementosP);
        } 
    }
    
      System.out.println("***************MATRIZ***************");
      for (int i = 0; i < con; i++) {
          System.out.println(arbol[i][0] + " " + arbol[i][1] + " " + arbol[i][2]);
      }
      
      //contruir la grmática para generar el gráfico
      generarGramatica();

  }
  
  //SÓLO DEVUELVE EL TIPO DE OPERADOR EN LETRAS
  private static String tipoOperador(String op){
      if (op.equals("^")) return "pote_";
      if (op.equals("*")) return "multi_";
      if (op.equals("/")) return "divi_";
      if (op.equals("+")) return "suma_";
      if (op.equals("-")) return "resta_";
      
      return "";
  }
  
  private void generarGramatica(){
      
      grafico="digraph G {\n" +
                "node [shape=box, color=blue]";
      for (int i = 0; i < con; i++) {
          grafico += "\n" + arbol[i][1] + " -> " + arbol[i][0] + ";";
          grafico += "\n" + arbol[i][1] + " -> " + arbol[i][2] + ";";
      }
      grafico += "\n};";
      System.out.println("Gramatica para el gráfico: " + grafico);
      TxtGramatica.setText(grafico);
      
        //Dibujar el arbol. SÓLO CON UN DIBUJAR NO ME FUNCINÓ, NO ENTIENDO POR QUÉ NO REFRESCA LA IMAGEN EL LABEL
        Dibujar();
  }
  
  
  //EJECUTA GRAPHVIZ, CON LA COMANDO DOT.EXE DE CONSOLA, SE LA PASAN LOS PARÁMETROS
    public void Dibujar(){
    try {
        
        //CREAR EL ARCHIVO DE TEXTO CON LA TRADUCCIÓN GENERADA
        String ruta = "c:\\Salida\\ArbolSintactico.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(grafico);
            bw.close();

            
        String dotPath = "c:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";

        String fileInputPath = "c:\\Salida\\ArbolSintactico.txt";

        String fileOutputPath = "c:\\Salida\\ArbolSintactico.jpg";

        String tParam = " -Tjpg ";
        String tOParam = " -o ";

        String completa = dotPath + tParam + fileInputPath + tOParam + fileOutputPath; //CADENA COMPLETA PARA CREAR LA IMAGEN
        
        Runtime rt = Runtime.getRuntime(); //EJECUTA COMANDOS DE CMD
        rt.exec(completa); //EJECUTA COMANDOS DE CMD
        
        
        System.out.println("Proceso terminado con éxito");
        
        
        
        insertarImagen("c:/Salida/ArbolSintactico.jpg");


    }catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error al intentar crear con GraphViz dot.exe la imagen " + ex);
    }
    }
    
    public void insertarImagen(String direccion){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //PROBAR METER IMAGENES EN PANE O LBL
            ImageIcon imagen = new ImageIcon(direccion);
            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(LblVisor.getWidth(), LblVisor.getHeight(), Image.SCALE_DEFAULT));
            LblVisor.setIcon(icono);
    }
    
    public void Limpiar(){
        //Declaración de las pilas
        while(!E.isEmpty()){
            E.pop();
        }
        while(!P.isEmpty()){
            P.pop();
        }
        while(!S.isEmpty()){
            S.pop();
        }
        
        for (int i = 0; i < con; i++) {
            arbol [i][0] = "";
            arbol [i][1] = "";
            arbol [i][2] = "";
        }
        
        post ="";
        con=0;
        grafico = "";
        TxtGramatica.setText(null);
        TxtResultado3.setText(null);
        TxtResultado.setText(null);
        
        String ordenes = "del c:/Salida/ArbolSintactico.jpg";
        
        Runtime rt = Runtime.getRuntime(); //EJECUTA COMANDOS DE CMD
        try {
            rt.exec(ordenes); //EJECUTA COMANDOS DE CMD
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
  
//public class TimerRetraso extends TimerTask {
//
//    @Override
//    public void run() {
//        buscarImagen();
//    }
//
//    public void buscarImagen() {
//        //PROBAR METER IMAGENES EN PANE O LBL
//            ImageIcon imagen = new ImageIcon("c:/Salida/ArbolSintactico.jpg");
//            ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(LblVisor.getWidth(), LblVisor.getHeight(), Image.SCALE_DEFAULT));
//            LblVisor.setIcon(icono);
//    }
//}
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAnalizar;
    private javax.swing.JButton BtnVerImagen;
    private javax.swing.JComboBox<String> CmbEjemplos;
    private javax.swing.JLabel LblVisor;
    private javax.swing.JTextField TxtEntrada;
    private javax.swing.JTextArea TxtGramatica;
    private javax.swing.JTextField TxtResultado;
    private javax.swing.JTextField TxtResultado3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
