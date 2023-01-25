package mildthreat.framecalc.config;

import com.azure.spring.cloud.autoconfigure.aad.AadWebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity(debug = true)
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class AADOAuth2LoginSecurityConfig extends AadWebSecurityConfigurerAdapter {

    /**
     * Add configuration logic as needed.
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
        http.csrf().disable()//TODO: Determine how to make this work without disabling CSRF
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .oauth2Login()
                .loginPage("/oauth2/authorization/azure");

        // Do some custom configuration.
    }
}

