// src/script/scala/progscala3/patternmatching/MatchTreeADTExhuastive.scala
import progscala3.patternmatching.Tree
import Tree.{Branch, Leaf}

val enumSeq: Seq[Tree[Int]] = Seq(Leaf(0), Branch(Leaf(6), Leaf(7)))
for t <- enumSeq
yield t match
  case Branch(left, right) => (left, right)
  case Leaf(value) => value
// val res0: Seq[Any] = List(0, (Leaf(6),Leaf(7)))

import progscala3.patternmatching.{STree, SBranch, SLeaf}

val sealedSeq: Seq[STree[Int]] = Seq(SLeaf(0), SBranch(SLeaf(6), SLeaf(7)))
for t <- sealedSeq
yield t match
  case SBranch(left, right) => (left, right)
  case SLeaf(value) => value
// val res1: Seq[Any] = List(0, (SLeaf(6),SLeaf(7)))

