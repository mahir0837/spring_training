package com.sarac.bootstrap;

import com.sarac.entity.*;
import com.sarac.enums.Status;
import com.sarac.repository.CartRepository;
import com.sarac.repository.ItemRepsitory;
import com.sarac.repository.MerchantRepository;
import com.sarac.repository.PaymentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

@Component
public class DataGenerator implements CommandLineRunner {

    private final PaymentRepository paymentRepository;
    private final MerchantRepository merchantRepository;
    private final ItemRepsitory itemRepsitory;
    private final CartRepository cartRepository;


    public DataGenerator(PaymentRepository paymentRepository, MerchantRepository merchantRepository, ItemRepsitory itemRepsitory, CartRepository cartRepository) {
        this.paymentRepository = paymentRepository;
        this.merchantRepository = merchantRepository;
        this.itemRepsitory = itemRepsitory;
        this.cartRepository = cartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Payment payment1 = new Payment(LocalDate.of(2022, 4, 19), new BigDecimal("150000"), Status.SUCCESS);
        PaymentDetail paymentDetail1 = new PaymentDetail(new BigDecimal("140000"), new BigDecimal("10000"), LocalDate.of(2022, 4, 24));

        payment1.setPaymentDetail(paymentDetail1);

        Payment payment2 = new Payment(LocalDate.of(2022, 4, 25), new BigDecimal("100000"), Status.FAILURE);
        PaymentDetail paymentDetail2 = new PaymentDetail(new BigDecimal("90000"), new BigDecimal("5000"), LocalDate.of(2022, 4, 29));

        payment2.setPaymentDetail(paymentDetail2);
        Merchant merchant1 = new Merchant("AmazonSubMerchant","M123",new BigDecimal("0.25"),new BigDecimal("3.25"),5);

        payment1.setMerchant(merchant1);
        payment2.setMerchant(merchant1);

        Item item1 = new Item("Milk","M01");
        Item item2 = new Item("Sugar","S01");
        Item item3 = new Item("Bread","B01");

        Cart cart1 = new Cart();
        Cart cart2 = new Cart();

        cart1.setItems(Arrays.asList(item1,item2,item3));
        cart2.setItems(Arrays.asList(item1,item2));

        itemRepsitory.save(item1);
        itemRepsitory.save(item2);
        itemRepsitory.save(item3);

        cartRepository.save(cart1);
        cartRepository.save(cart2);

        merchantRepository.save(merchant1);

        paymentRepository.save(payment1);
        paymentRepository.save(payment2);





    }
}
