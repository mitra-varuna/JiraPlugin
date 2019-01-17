package com.ssushant.myplugin.impl;

import com.atlassian.plugin.spring.scanner.annotation.export.ExportAsService;
import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
import com.atlassian.sal.api.ApplicationProperties;
import com.ssushant.myplugin.api.MyPluginComponent;

import javax.inject.Inject;
import javax.inject.Named;

import static java.lang.String.format;
import static java.util.Optional.ofNullable;

@ExportAsService({MyPluginComponent.class})
@Named("myPluginComponent")
public class MyPluginComponentImpl implements MyPluginComponent {
    @ComponentImport
    private final ApplicationProperties applicationProperties;

    @Inject
    public MyPluginComponentImpl(final ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    public String getName() {
        return ofNullable(applicationProperties)
                .map(ApplicationProperties::getDisplayName)
                .map(name -> format("myComponent:%s", name))
                .orElse("myComponent");
    }
}