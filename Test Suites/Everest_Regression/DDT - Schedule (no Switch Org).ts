<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>Data Driven Test&#xd;
Tests basic Schedule operations&#xd;
Filter&#xd;
Select Department and Schedule Period</description>
   <name>DDT - Schedule (no Switch Org)</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>3bccb3e6-7675-4924-b0cb-cee11e43b09f</testSuiteGuid>
   <testCaseLink>
      <guid>8a2a5703-6a78-4e6d-8d43-08c1d68eb496</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Everest_Regression_Tests/Home/TC-01 Login no Switch Org</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>e96ae57b-f06f-4b47-8a43-7dfeedefbdb5</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Everest_Regression/TC-01 Home Login Credential</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>e96ae57b-f06f-4b47-8a43-7dfeedefbdb5</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Username</value>
         <variableId>c8f49210-941d-44e9-ae7f-de75574c6263</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e96ae57b-f06f-4b47-8a43-7dfeedefbdb5</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Password</value>
         <variableId>1746a4bd-7f39-47a7-a730-a5ead5ec20bd</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>71aef2c5-5ba7-4288-8496-442eb1a60f4e</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Everest_Regression_Tests/Schedules/TC-SCH-01_OpenSchedulesSlider</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>faaf4a40-c666-442d-9419-62df81590589</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Everest_Regression_Tests/Schedules/TC-SCH-04a_AccessSchedulebySchedulesSlider</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>1daa4e6f-9159-449d-b2f2-1021a34fd469</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Everest_Regression/TC-04a AccessSchedulebySchedulesSlider Period and Department</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>1daa4e6f-9159-449d-b2f2-1021a34fd469</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>ScheduleFilterStartDate</value>
         <variableId>f6a5ab04-f17e-4e2c-b38f-1344b88d3b31</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1daa4e6f-9159-449d-b2f2-1021a34fd469</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>ScheduleFilterEndDate</value>
         <variableId>9f026056-e9c1-49d2-9801-332a3bf97823</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1daa4e6f-9159-449d-b2f2-1021a34fd469</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>SchedulePeriod</value>
         <variableId>c258be25-1749-4155-b036-e9f6339a9867</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1daa4e6f-9159-449d-b2f2-1021a34fd469</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Department</value>
         <variableId>27ec1fd0-f15a-4ec8-b21f-6a42d37441e3</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
