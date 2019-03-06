```scala
implicit val optionMonad: Monad[Option] =
  new Monad[Option] with impl.ApplyViaFlatMap[Option] {
    def flatMap[A, B](fa: Option[A])(f: A => Option[B]): Option[B] =
      fa.flatMap(f)
    def map[A, B](fa: Option[A])(f: A => B): Option[B] =
      fa.map(f)
    def pure[A](x: A): Option[A] =
      Some(x)
  }
```

---

```scala
implicit val optionMonad: Monad[Option] =
  new Monad[Option] with impl.ApplyViaFlatMap[Option] {
    def flatMap[A, B](fa: Option[A])(f: A => Option[B]): Option[B] =
      fa.flatMap(f)
    def map[A, B](fa: Option[A])(f: A => B): Option[B] =
      fa.map(f)
    def pure[A](x: A): Option[A] =
      Some(x)
  }
```