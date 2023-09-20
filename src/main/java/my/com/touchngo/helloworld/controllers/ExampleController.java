package my.com.touchngo.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api")
public class ExampleController {

    @RequestMapping(value = "/index", method = { RequestMethod.POST, RequestMethod.GET })
    public String handlePostRequest(Model model) {
        model.addAttribute("message", "Hello from Thymeleaf!");
        return "index"; // This corresponds to the template name without the .html extension
    }

    @RequestMapping(value = "/merchantReturnUrl", method = { RequestMethod.POST, RequestMethod.GET })
    public String merchantReturnUrl(
            @RequestParam(name = "tagSerialNum", required = false) String tagSerialNum,
            @RequestParam(name = "vehiclePlateNumber", required = false) String vehiclePlateNumber,
            @RequestParam(name = "PaymentID", required = false) String paymentID,
            @RequestParam(name = "OrderNumber", required = false) String orderNumber,
            @RequestParam(name = "TxnStatus", required = false) String txnStatus,
            @RequestParam(name = "TxnMessage", required = false) String txnMessage) {

                System.out.println("tagSerialNum: " + tagSerialNum);
                System.out.println("vehiclePlateNumber: " + vehiclePlateNumber);
                System.out.println("PaymentID: " + paymentID);
                System.out.println("OrderNumber: " + orderNumber);
                System.out.println("TxnStatus: " + txnStatus);
                System.out.println("TxnMessage: " + txnMessage);
        return "index";
    }
}
