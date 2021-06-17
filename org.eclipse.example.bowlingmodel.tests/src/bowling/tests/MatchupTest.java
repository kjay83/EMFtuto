/**
 */
package bowling.tests;

import javax.tools.Diagnostic;

import org.eclipse.emf.ecore.util.Diagnostician;

import bowling.BowlingFactory;
import bowling.Game;
import bowling.Matchup;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Matchup</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MatchupTest extends TestCase {

	/**
	 * The fixture for this Matchup test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Matchup fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MatchupTest.class);
	}

	/**
	 * Constructs a new Matchup test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchupTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Matchup test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Matchup fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Matchup test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Matchup getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BowlingFactory.eINSTANCE.createMatchup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}
	

	
	public void testMatchupGameRef() {
		   Matchup matchup = BowlingFactory.eINSTANCE.createMatchup();
		   Game game = BowlingFactory.eINSTANCE.createGame();
		   matchup.getGames().add(game);
		   assertEquals(game.getMatchup(), matchup);
		}
		//The super class EObjects offers many methods to access an entity in a more generic way. For example, we will test the containment between Matchup and Game by accessing the EContainer instead of the getMatchup() method.
		public void testMatchupGameRefEcontainer() {
		   Matchup matchup = BowlingFactory.eINSTANCE.createMatchup();
		   Game game = BowlingFactory.eINSTANCE.createGame();
		   matchup.getGames().add(game);
		   assertEquals(game.eContainer(), matchup);
		}
		
//		public void testValidation() {
//			   Matchup matchup = BowlingFactory.eINSTANCE.createMatchup();
//			   matchup.getGames().add(BowlingFactory.eINSTANCE.createGame());
//			   Diagnostic<?> validate = (Diagnostic<?>) Diagnostician.INSTANCE.validate(matchup);
//			   assertEquals(Diagnostic.Kind.ERROR, ((org.eclipse.emf.common.util.Diagnostic) validate).getSeverity());
//			}

} //MatchupTest
