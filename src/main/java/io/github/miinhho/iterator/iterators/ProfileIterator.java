package io.github.miinhho.iterator.iterators;

import io.github.miinhho.iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
