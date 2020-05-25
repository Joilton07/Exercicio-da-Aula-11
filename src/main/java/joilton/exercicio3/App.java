package joilton.exercicio3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {
	
	private BorderPane pane;
	private Button linguagem, moeda, anuncio, hospedar, ajuda, cadastro, entrar, busca, comunicSaiba, sair, fonte;
	private TextField caixaLugar, dataEnt, dataSai , hospede , comuniInfo;
	private Label titulo , lugar, checkint, checkout, hospedes;
	private static Stage stage;
    
	
	 @Override
	public void start(Stage stage) {
		 
		 inializar();
		 tela(stage);
		 stage = App.stage;
		 initListeners();
		 
	}	 
	
	public static void main(String[] args) {
		launch();
	}
	 

		 
	 
    
	private void tela(Stage stage) {
    	Scene scene = new Scene(pane);
    	stage.setScene(scene);
    	stage.setTitle("AIRBNB");
    	stage.setResizable(true);
    	stage.show();
	}
	
	
    private void inializar() {
    	
    	pane = new BorderPane();
		pane.setPrefSize(1000, 900);
		
		HBox HBoxMenu = logo();
		pane.setTop(HBoxMenu);
		
		HBox HBoxTopicos = topicos();
		pane.setRight(HBoxTopicos);
		HBoxTopicos.setAlignment(Pos.TOP_RIGHT);
		
		VBox VBoxCaixaInfo = caixaInformacao();
		pane.setLeft(VBoxCaixaInfo);
		VBoxCaixaInfo.setAlignment(Pos.CENTER_LEFT);
		
		HBox HBoxSair = Sair();
		pane.setBottom(HBoxSair);
		HBoxSair.setAlignment(Pos.CENTER);
    	
	}
    
    private HBox logo() {
    		
    	HBox menuLogo = new HBox(200);
    	
    	Label logo = new Label("AIRBNB");
    	menuLogo.getChildren().add(logo);
    	logo.setAlignment(Pos.TOP_LEFT);
    	
    	return menuLogo;
		
    	
    }
    
    private HBox topicos() {
    	
    	HBox botao = new HBox(30);
    	linguagem = new Button("Português(BR)");
    	moeda = new Button("R$ BRL");
    	anuncio = new Button("Anuncie seu espaço");
    	hospedar = new Button("Hospede uma experiência");
    	ajuda = new Button("Ajuda");
    	cadastro = new Button("Cadastrar-se");
    	entrar = new Button("Entrar");
    	
    	botao.getChildren().addAll(linguagem, moeda, anuncio, hospedar, ajuda, cadastro, entrar);
//    	linguagem.setAlignment(Pos.TOP_LEFT);
//    	moeda.setAlignment(Pos.TOP_LEFT);
//    	anuncio.setAlignment(Pos.TOP_LEFT);
//    	hospedar.setAlignment(Pos.TOP_LEFT);
//    	ajuda.setAlignment(Pos.TOP_LEFT);
//    	cadastro.setAlignment(Pos.TOP_LEFT);
//    	entrar.setAlignment(Pos.TOP_LEFT);
    	
    	return botao;

    }
    
    private VBox caixaInformacao() {
    	
    	VBox infor = new VBox(20);
    	//  checkint, checkout, hospedes;
    	titulo = new Label("RESERVE LUGARES ÚNICOS PARA SE HOSPEDAR E COISAS PARA FAZER");
    	lugar = new Label("ONDE");
    	// caixaLugar, dataEnt, dataSai , hospede;
    	caixaLugar = new TextField();
    	caixaLugar.setPromptText("Em qualquer lugar");
    	checkint = new Label("CHECK-IN");
    	dataEnt = new TextField();
    	dataEnt.setPromptText("dd/mm/aaaa");
    	checkout = new Label("CHECK-OUT");
    	dataSai = new TextField();
    	dataSai.setPromptText("dd/mm/aaaa");
    	hospedes = new Label("HÓSPEDES");
    	hospede = new TextField();
    	hospede.setPromptText("Hóspedes");
    	busca = new Button("Buscar");
    	
    	
    	comuniInfo = new TextField("O Airbnb está tomando medidas para apoiar nossa comunidade neste momento de necessidade.");
    	comunicSaiba = new Button("Saiba mais");
    	
    	infor.getChildren().addAll(titulo, lugar, caixaLugar, checkint, dataEnt, checkout, dataSai, hospedes, hospede, busca,comuniInfo, comunicSaiba);
    	
    	return infor;
    	
    }
    
    private HBox Sair() {
    	
    	HBox Sair = new HBox();
    	
    	sair = new Button("Sair");
    	fonte = new Button("Fonte");
    	
    	Sair.getChildren().addAll(sair, fonte);
    	
    	return Sair;
    	
    }
    
    public void initListeners() {
		sair.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				fechaTela();
			}
		});
		fonte.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Informação");
				alert.setHeaderText(null);
				alert.setContentText("https://www.airbnb.com.br/");
				
				alert.showAndWait();
			}
		});
		
		entrar.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Informação");
				alert.setHeaderText(null);
				alert.setContentText("No momento não esta funcionando");
				
				alert.showAndWait();
			}
		});
		busca.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Alert alert = new Alert(AlertType.CONFIRMATION);
				alert.setTitle("Informando");
				alert.setHeaderText(null);
				alert.setContentText("Estamos Buscando");
				
				alert.showAndWait();
				
			}
		});
	}
    	
	private void fechaTela() {
		System.exit(0);
	}
    

}