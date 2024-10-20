package com.example.demo.scenario;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Indexed;

/**
 * Annotation needed for a scenarios to get hooked up into a catalog app.
 * Typically all fields in this annotation needs to have content to get attached
 * into a catalog app.
 *
 * @author Janne Valkealahti
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Indexed
@Component
public @interface ScenarioComponent {

    /**
     * Define a name of a scenario.
     *
     * @return name of a scenario
     */
    String name() default "";

    /**
     * Define a short description of a scenario.
     *
     * @return short description of a scenario
     */
    String description() default "";

    /**
     * Define a categories of a scenario.
     *
     * @return categories of a scenario
     */
    String[] category() default {};
}