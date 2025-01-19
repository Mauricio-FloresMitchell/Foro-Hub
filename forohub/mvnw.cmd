@echo off
@REM ----------------------------------------------------------------------------
@REM Licensed to the Apache Software Foundation (ASF) under one
@REM or more contributor license agreements. See the NOTICE file
@REM distributed with this work for additional information
@REM regarding copyright ownership. The ASF licenses this file
@REM to you under the Apache License, Version 2.0 (the
@REM "License"); you may not use this file except in compliance
@REM with the License. You may obtain a copy of the License at
@REM
@REM https://www.apache.org/licenses/LICENSE-2.0
@REM
@REM Unless required by applicable law or agreed to in writing,
@REM software distributed under the License is distributed on an
@REM "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
@REM KIND, either express or implied. See the License for the
@REM specific language governing permissions and limitations
@REM under the License.
@REM ----------------------------------------------------------------------------

@REM Find java executable
set JAVA_EXE=java
if defined JAVA_HOME goto findJavaFromJavaHome

:findJavaFromJavaHome
set JAVA_EXE=%JAVA_HOME%\bin\java.exe

@if not exist "%JAVA_EXE%" (
    echo Error: JAVA_HOME is set to an invalid directory.
    echo JAVA_HOME = "%JAVA_HOME%"
    exit /b 1
)

@setlocal
set MAVEN_PROJECTBASEDIR=%~dp0
set CLASSWORLDS_JAR="%MAVEN_PROJECTBASEDIR%\.mvn\wrapper\maven-wrapper.jar"
set CLASSWORLDS_LAUNCHER=org.apache.maven.wrapper.MavenWrapperMain

"%JAVA_EXE%" %MAVEN_OPTS% -classpath %CLASSWORLDS_JAR% "-Dmaven.multiModuleProjectDirectory=%MAVEN_PROJECTBASEDIR%" %CLASSWORLDS_LAUNCHER% %*
@endlocal
