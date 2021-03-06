/*
 * Copyright 2013-2019 the original author or authors.
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

package org.springframework.cloud.contract.verifier.messaging.camel

import org.apache.camel.CamelContext
import org.apache.camel.impl.DefaultCamelContext
import spock.lang.Specification

/**
 * @author Marcin Grzejszczak
 * @since
 */
class ContractVerifierCamelMessageBuilderSpec extends Specification {
	def "should not throw an exception when headers are null"() {
		given:
			CamelContext camelContext = new DefaultCamelContext()
			ContractVerifierCamelMessageBuilder builder = new ContractVerifierCamelMessageBuilder(camelContext)
		when:
			builder.create(null, null)
		then:
			noExceptionThrown()
	}
}
