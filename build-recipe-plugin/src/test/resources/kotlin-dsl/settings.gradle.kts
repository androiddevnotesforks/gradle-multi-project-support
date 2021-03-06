/*
 * Copyright 2019 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

rootProject.name = "test"

include(":coffee:api:client")
project(":coffee:api:client").projectDir = File("../coffee/api/client")
include(":coffee:api:protocol")
project(":coffee:api:protocol").projectDir = File("../coffee/api/protocol")
include(":coffee:api:server")
project(":coffee:api:server").projectDir = File("../coffee/api/server")


include(":juice:api:client")
project(":juice:api:client").projectDir = File("../juice/api/client")
include(":juice:api:protocol")
project(":juice:api:protocol").projectDir = File("../juice/api/protocol")
include(":juice:api:server")
project(":juice:api:server").projectDir = File("../juice/api/server")
