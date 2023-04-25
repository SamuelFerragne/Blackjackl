package blackjack;


import ca.ntro.app.NtroClientFx;
import ca.ntro.app.backend.BackendRegistrar;
import ca.ntro.app.frontend.FrontendRegistrarFx;
import ca.ntro.app.messages.MessageRegistrar;
import ca.ntro.app.models.ModelRegistrar;
import blackjack.commun.messages.MsgAjouterValeurBidon;
import blackjack.commun.modeles.ModeleBlackjack;
import blackjack.commun.valeurs.MaValeur;
import blackjack.dorsal.DorsalBlackjack;
import blackjack.frontal.FrontalBlackjack;


public class BlackjackLocal implements NtroClientFx {

	public static void main(String[] args) {
		NtroClientFx.launch(args);
	}

	@Override
	public void registerFrontend(FrontendRegistrarFx registrar) {

		registrar.registerFrontend(new FrontalBlackjack());
	}

	@Override
	public void registerMessages(MessageRegistrar registrar) {

		registrar.registerMessage(MsgAjouterValeurBidon.class);

	}

	@Override
	public void registerModels(ModelRegistrar registrar) {
		registrar.registerModel(ModeleBlackjack.class);
		registrar.registerValue(MaValeur.class);
	}

	@Override
	public void registerBackend(BackendRegistrar registrar) {
		registrar.registerBackend(new DorsalBlackjack());

	}

}
