package com.facebook.presto.sql.compiler;

import com.google.common.base.Preconditions;

import java.util.Map;

public class AnalyzedOutput
{
    private final TupleDescriptor descriptor;
    private final Map<Slot, AnalyzedExpression> expressions;

    public AnalyzedOutput(TupleDescriptor descriptor, Map<Slot, AnalyzedExpression> expressions)
    {
        Preconditions.checkNotNull(descriptor, "descriptor is null");
        Preconditions.checkNotNull(expressions, "expressions is null");

        this.descriptor = descriptor;
        this.expressions = expressions;
    }

    public Map<Slot, AnalyzedExpression> getExpressions()
    {
        return expressions;
    }

    public TupleDescriptor getDescriptor()
    {
        return descriptor;
    }
}
