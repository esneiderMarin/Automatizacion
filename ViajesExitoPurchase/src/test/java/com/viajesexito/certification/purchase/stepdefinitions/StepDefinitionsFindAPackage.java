package com.viajesexito.certification.purchase.stepdefinitions;

import java.util.List;

import org.codehaus.groovy.antlr.treewalker.VisitorAdapter;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import com.viajesexito.certification.purchase.exceptions.ElementNoFound;
import com.viajesexito.certification.purchase.model.ExceptionsError;
import com.viajesexito.certification.purchase.model.ViajesExitoModel;
import com.viajesexito.certification.purchase.questions.AnswerResult;
import com.viajesexito.certification.purchase.tasks.FillForm;
import com.viajesexito.certification.purchase.tasks.OpenTheBrowser;
import com.viajesexito.certification.purchase.tasks.SearchPackage;
import com.viajesexito.certification.purchase.tasks.SelectPackage;
import com.viajesexito.certification.purchase.userinterface.ViajesExitoHomePage;
import com.viajesexito.certification.purchase.userinterface.ViajesExitosHomePrincipalPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;

public class StepDefinitionsFindAPackage {
	
	@Managed(driver ="chrome")
	
	public static WebDriver hisBrowser; // variable de clase  instanciada
	
	private Actor dann = Actor.named("Dann");
	
	private ViajesExitoHomePage viajesExitoHomePage;
	public ViajesExitoModel viajesExitoModel;
	
	@Before
	public void setUp() {
		dann.can(BrowseTheWeb.with(hisBrowser));}
	
	
	@Given("^that Dann wants to buy a tourist package$")
	public void thatDannWantsToBuyATouristPackage() throws Exception {
		dann.wasAbleTo(OpenTheBrowser.on(viajesExitoHomePage));
		//dann.should(GivenWhenThen.seeThat(AnswerResult.es(ViajesExitosHomePrincipalPage.TXT_VALIDACION_PAGE_ON), Matchers.equalTo("Mis Reservas")).orComplainWith(ElementNoFound.class, ExceptionsError.mensajeDeErrorParaRespuestaNoNetwork("Mis Reservas")));
	}

	@When("^Dann fill the fields of the search package$")
	public void dannFillTheFieldsOfTheSearchPackage(List<List<String>> datos) throws Exception {
		dann.attemptsTo(SearchPackage.on(datos), SelectPackage.on(), FillForm.on());
	}

	@Then("^Dann should see a list of packages$")
	public void dannShouldSeeAListOfPackages() throws Exception {
		dann.should(GivenWhenThen.seeThat(AnswerResult.es(ViajesExitosHomePrincipalPage.TXT_VALIDACION_PAGE_FINAL), Matchers.equalTo("Paga tu viaje")).orComplainWith(ElementNoFound.class, ExceptionsError.mensajeDeErrorParaRespuesta("Paga tu viaje")));
	}
}
