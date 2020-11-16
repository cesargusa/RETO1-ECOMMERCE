package com.example.Product.API;

import java.util.ArrayList;

import com.example.Product.Model.OrderProduct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrdersProductsViewController {
    @GetMapping("/OrderProducts")
    public ModelAndView GetAll(@RequestParam( name="orderId", required=false,defaultValue="0") int orderId){
        ArrayList<OrderProduct> result = OrdersProductsController.GetOrderProductbyOrder(orderId);
        
        ModelAndView mv = new ModelAndView("ordersProducts");
        mv.addObject("orderproduct", result);
        return mv;
    }
}
