package org.jonnyzzz.kotlin.mpp.template

import kotlin.test.Test


class ThisIsKotlinTest {
  @Test
  fun test() {
    assert(true)
  }

  @Test
  fun `test with long name`() {
    assert(false) { "this is executed to generate failure message" }
  }

}

