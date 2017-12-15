package com.learing;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder
{
    @Override
    public void configure() throws Exception {
        from("file:/home/delll-5470/test/input_folder/")
                .to("file:/home/delll-5470/test/output_folder/");
    }
}
