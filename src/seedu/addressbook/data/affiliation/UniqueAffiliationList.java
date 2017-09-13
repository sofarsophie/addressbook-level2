package seedu.addressbook.data.affiliation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import seedu.addressbook.common.Utils;
import seedu.addressbook.data.exception.DuplicateDataException;

/**
 * A list of affiliations. Does not allow nulls or duplicates.
 *
 * @see Affiliation#equals(Object)
 * @see Utils#elementsAreUnique(Collection)
 */

public class UniqueAffiliationList implements Iterable<Affiliation>{

    /**
     * Signals that an operation would have violated the 'no duplicates' property of the list.
     */
    public static class DuplicateAffiliationException extends DuplicateDataException {
        protected DuplicateAffiliationException() {
            super("Operation would result in duplicate affiliations.");
        }
    }

    private final List<Affiliation> internalList = new ArrayList<>();

    /**
     * Constructs an empty AffiliationList.
     */
    public UniqueAffiliationList() {}

}
