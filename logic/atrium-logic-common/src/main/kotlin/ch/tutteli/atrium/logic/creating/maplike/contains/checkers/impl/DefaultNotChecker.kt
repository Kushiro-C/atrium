//TODO remove file with 0.19.0
@file:Suppress("DEPRECATION")

package ch.tutteli.atrium.logic.creating.maplike.contains.checkers.impl

import ch.tutteli.atrium.assertions.Assertion
import ch.tutteli.atrium.assertions.builders.assertionBuilder
import ch.tutteli.atrium.logic.creating.maplike.contains.checkers.NotChecker
import ch.tutteli.atrium.translations.DescriptionAnyExpectation.TO_EQUAL

//TODO remove? looks like this is not used anymore
/**
 * Represents a check that an expected entry is not contained in the [Iterable].
 */
class DefaultNotChecker : NotChecker {

    override fun createAssertion(foundNumberOfTimes: Int): Assertion =
        assertionBuilder.createDescriptive(TO_EQUAL, 0) { foundNumberOfTimes == 0 }
}
