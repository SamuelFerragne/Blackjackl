package blackjack.commun.monde2d;

import ca.ntro.app.fx.controls.ResizableWorld2dCanvasFx;
import ca.ntro.app.fx.controls.World2dMouseEventFx;
import ca.ntro.core.initialization.Ntro;


public class Carte2d extends ObjetBlackjack2d {
	
	private int numero;
	private String sorte;
	
	public Carte2d() {
		super();
	}
	
	public Carte2d(int numero, String sorte) {
		super();
		this.numero = numero;
		this.sorte = sorte;
		
	}
	
	@Override
	 public void initialize() {
       setWidth(10);
       setHeight(10);
       setTopLeftX(100);
       setTopLeftY(100);
   }

	@Override
	public void drawOn(ResizableWorld2dCanvasFx canvas) {
	        canvas.drawOnWorld(gc -> {
	            gc.strokeText(id(), getTopLeftX(), getTopLeftY());
	        });
	    }

	@Override
	public String id() {
		// TODO Auto-generated method stub
		return numero + " " + sorte;
	}


	@Override
	protected boolean onMouseEvent(World2dMouseEventFx mouseEvent) {
		// TODO Auto-generated method stub
		return false;
	}


}
