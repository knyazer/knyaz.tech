package tech.knyaz.server;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class ServerAPITests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldBeActive() throws Exception {
		mockMvc.perform(get("/api/status")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Active")));
	}

	@Test
	public void setTempVarIsSuccessful() throws Exception {
		mockMvc.perform(get("/api/temp/set?value=0")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Success")));
	}

	@Test
	public void tempVarWorking() throws Exception {
		mockMvc.perform(get("/api/temp/set?value=blahblahblah"));

		mockMvc.perform(get("/api/temp/get")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("blahblahblah")));
	}
}