import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SolutionTest {
    private Solution solution;
    public static Logger logger;
    private int input;
    private int expected;

    public SolutionTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @BeforeClass
    public static void beforeClass() {
        logger = Logger.getLogger("Solution Test");
        logger.info("Running @BeforeClass");
    }

    @Before
    public void setUp() {
        solution = new Solution();
        logger.info("Running @Before");
    }


    @Test
    public void test1() {
        logger.info("Running test1");
        assertEquals(516560652, solution.getMaxProduct(55));
    }

    @Test
    public void test2() {
        logger.info("Running test2");
        assertEquals(36, solution.getMaxProduct(10));
    }

    @Test
    public void test3() {
        logger.info("Running test2");
        assertEquals(59049, solution.getMaxProduct(30));
    }


    @Parameterized.Parameters
    public static List<Integer[]> parameters() throws IOException {
        InputStreamReader inputStreamReader = null;
        File f = new File("D:\\TJU\\22232\\SoftwareTest\\SoftwareTestLab\\Lab2\\src\\main\\resources\\testinput.txt");
        try {
            inputStreamReader = new InputStreamReader(new
                    FileInputStream(f));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<Integer[]> list = new ArrayList<>();
        assert inputStreamReader != null;
        BufferedReader in = new BufferedReader(inputStreamReader);
        String tmp = "";
        tmp = in.readLine();
        while (tmp != null && !tmp.equals("")) {
            String[] arr = tmp.split(",");
            Integer[] item = {Integer.parseInt(arr[0]),
                    Integer.parseInt(arr[1])};
            list.add(item);
            tmp = in.readLine();
        }
        return list;
    }

    @Test
    public void testAll() {
        assertEquals(this.expected, solution.getMaxProduct(this.input));
    }

    @After
    public void tearDown() {
        logger.info("Running @After");
    }

    @AfterClass
    public static void afterClass() {
        logger.info("Running @AfterClass");
    }
}