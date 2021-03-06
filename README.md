You have successfully created an Atlassian Plugin!

Here are the SDK commands you'll use immediately:

* `atlas-run`   -- installs this plugin into the product and starts it on localhost
* `atlas-debug` -- same as atlas-run, but allows a debugger to attach at port 5005
* `atlas-cli`   -- after atlas-run or atlas-debug, opens a Maven command line window:
                 - 'pi' reinstalls the plugin into the running product instance
* `atlas-help`  -- prints description for all commands in the SDK

Full documentation is always available at:

https://developer.atlassian.com/display/DOCS/Introduction+to+the+Atlassian+Plugin+SDK


# Notes

## Setting up Java Home

`export JAVA_HOME=$(/usr/libexec/java_home)`

## Installing Atlassian SDK

`brew tap atlassian/tap`

`brew install atlassian/tap/atlassian-plugin-sdk`

## Creating a new JIRA plugin project

`atlas-create-jira-plugin`

`atlas-mvn eclipse:eclipse` #useful for resolving mvn issues

[Adding SAL dependency](https://developer.atlassian.com/server/framework/atlassian-sdk/adding-sal-dependency/)

`atlas-mvn compile`
