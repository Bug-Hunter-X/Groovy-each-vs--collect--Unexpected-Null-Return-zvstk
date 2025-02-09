# Groovy each vs. collect: Unexpected Null Return

This example demonstrates a common issue in Groovy related to the `each` and `collect` methods.  The `each` method iterates over a collection and applies a closure to each element but doesn't return a modified collection. In contrast, `collect` transforms the collection and returns a new one.

This difference can lead to unexpected `null` results if you're not aware of the behavior.  The solution shows how to use `collect` for correctly transforming collections.