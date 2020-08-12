package com.bookapp;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;


public class TestBookApp extends KloudBookappApplicationTests
{

	
	private MockMvc mockMvc;
	
	@Test
	public void testBook() throws Exception {
		mockMvc.perform(get("/book-by-id/6")).andExpect(status().isOk())
				.andExpect(content().contentType("application/json;charset=UTF-8"))
				.andExpect(jsonPath("$.title").value("Angular")).andExpect(jsonPath("$.author").value("Greg Lim"))
				.andExpect(jsonPath("$.category").value("Tech")).andExpect(jsonPath("$.price").value(800));
}
}
