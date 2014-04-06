/*
 * Copyright 2012-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.spring.demo.doge.server.users;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * The {@link User} repository.
 * 
 * @author Phillip Webb
 * @author Josh Long
 */
public interface UserRepository extends MongoRepository<User, String> {

    // will be useful in tying in Spring Security
    User findByName (String username) ;


}
