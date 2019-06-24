/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jd.joyqueue.monitor;

/**
 * 生产者分区组信息
 * author: gaohaoxiang
 * email: gaohaoxiang@jd.com
 * date: 2018/10/10
 */
public class ProducerPartitionGroupMonitorInfo extends BaseMonitorInfo {

    private String topic;
    private String app;
    private int partitionGroupId;

    private EnQueueMonitorInfo enQueue;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public void setPartitionGroupId(int partitionGroupId) {
        this.partitionGroupId = partitionGroupId;
    }

    public int getPartitionGroupId() {
        return partitionGroupId;
    }

    public EnQueueMonitorInfo getEnQueue() {
        return enQueue;
    }

    public void setEnQueue(EnQueueMonitorInfo enQueue) {
        this.enQueue = enQueue;
    }
}