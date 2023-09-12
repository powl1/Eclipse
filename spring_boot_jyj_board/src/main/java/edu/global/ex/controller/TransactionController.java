package edu.global.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import edu.global.ex.service.TransactionTestService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class TransactionController {

	@Autowired
	private TransactionTestService testService;

	@GetMapping("/tran/{num}")
	public void transaction(@PathVariable int num) throws Exception {

		if (num == 1) {
			log.info("transactionTest1");
			testService.transactionTest1();
		} else if (num == 2) {
			log.info("transactionTest2");
			testService.transactionTest2();
		} else if (num == 3) {
			log.info("transactionTest3");
			testService.transactionTest3();
		} else if (num == 4) {
			log.info("transactionTest4");
			testService.transactionTest4();
		} else if (num == 5) {
			log.info("transactionTest5");
			testService.transactionTest5();
		}
	}

}