package se.citerus.dddsample.domain.shared;

/**
 * An entity, as explained in the DDD book.
 * 需要根据ID之类来区分的对象
 */
public interface Entity<T> {

  /**
   * Entities compare by identity, not by attributes.
   *
   * @param other The other entity.
   * @return true if the identities are the same, regardless of other attributes.
   */
  boolean sameIdentityAs(T other);

}
