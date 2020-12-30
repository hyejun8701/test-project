import com.example.test.controller.BoardController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

public class BoardControllerTest extends AbstractControllerTest {

    @Autowired
    BoardController boardController;

    @Override
    protected Object controller() {
        return boardController;
    }

    @Test
    public void getBoard() throws Exception {
        Long boardId = 1L;
        String board = "board";

        mockMvc.perform(MockMvcRequestBuilders.get("/board/" + boardId))
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.content().string(board));
    }
}
