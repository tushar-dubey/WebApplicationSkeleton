/*
 * Copyright 2015 Livotov Labs Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.livotov.labs.webskel.core.quartz.jobs;

import eu.livotov.labs.webskel.core.quartz.guice.Scheduled;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import javax.inject.Singleton;

@Singleton
@Scheduled(jobName = "simple-echo2", cronExpression = "0 0/1 * 1/1 * ? *")
public class SimpleEchoJob implements org.quartz.Job
{

    public void execute(final JobExecutionContext context) throws JobExecutionException
    {
        System.out.println("Simple Echo Job - Triggered !");
    }
}
