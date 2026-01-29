package kotlinlab.collections

/**
 * Collections are containers that support various ways to store and organize different objects and make them easily accessible. A collection usually contains a number of objects (this number may be zero) of the same type.
 *
 * Objects in a collection are called elements or items. Collections are an implementation of abstract data structures that can support the following operations:
 *
 * retrieving an element;
 *
 * removing an element;
 *
 * changing or replacing an element;
 *
 * adding a new element.
 *
 * Collections can either be mutable and immutable
 *
 * Mutable collections also let you access the elements, but in addition, they allow operations that change the content of a collection by adding, removing, or updating the stored items. For example, you may have a collection of favorite restaurants that can change over time.
 *
 * Immutable collection is a type of collection that, once created, cannot be modified.
 *
 *
 * Kotlin Standard Library provides the implementation for the basic types of collections: list, set, and map. All three exist in mutable and immutable variations. Before we consider each type in detail, let's have a quick overview.
 *
 * List stores elements in a specified order and provides indexed access to them.
 *
 * Set stores unique elements whose order is generally undefined.
 *
 * Map stores key-value pairs (entries); keys are unique, but different keys can be paired with equal values.
 *
 *
 */