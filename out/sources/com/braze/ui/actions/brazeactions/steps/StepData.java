package com.braze.ui.actions.brazeactions.steps;

import Na.l;
import com.braze.enums.Channel;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p293xa.g;

/* JADX INFO: compiled from: StepData.kt */
/* JADX INFO: loaded from: classes.dex */
public final class StepData {
    public static final String ARGS = "args";
    public static final Companion Companion = new Companion(null);
    private final g args$delegate;
    private final Channel channel;
    private final g firstArg$delegate;
    private final g secondArg$delegate;
    private final JSONObject srcJson;

    /* JADX INFO: compiled from: StepData.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public StepData(JSONObject srcJson, Channel channel) {
        i.e(srcJson, "srcJson");
        i.e(channel, "channel");
        this.srcJson = srcJson;
        this.channel = channel;
        this.args$delegate = a.a(new Ia.a<List<? extends Object>>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$args$2
            {
                super(0);
            }

            @Override // Ia.a
            public final List<? extends Object> invoke() {
                Iterator aVar;
                final JSONArray jSONArrayOptJSONArray = this.this$0.getSrcJson().optJSONArray(StepData.ARGS);
                if (jSONArrayOptJSONArray == null) {
                    EmptyList.f42983b.getClass();
                    aVar = r.f43021b;
                } else {
                    aVar = new n.a(new n(SequencesKt___SequencesKt.C(q.H(l.J(0, jSONArrayOptJSONArray.length())), new Ia.l<Integer, Boolean>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$args$2$invoke$$inlined$iterator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final Boolean invoke(int i10) {
                            return Boolean.valueOf(Objects.nonNull(jSONArrayOptJSONArray.opt(i10)));
                        }

                        @Override // Ia.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                            return invoke(num.intValue());
                        }
                    }), new Ia.l<Integer, Object>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$args$2$invoke$$inlined$iterator$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final Object invoke(int i10) throws JSONException {
                            Object obj = jSONArrayOptJSONArray.get(i10);
                            if (obj != null) {
                                return obj;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                        }

                        @Override // Ia.l
                        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                            return invoke(num.intValue());
                        }
                    }));
                }
                return SequencesKt___SequencesKt.F(SequencesKt__SequencesKt.x(aVar));
            }
        });
        this.firstArg$delegate = a.a(new Ia.a<Object>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$firstArg$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Object invoke() {
                return this.this$0.getArg$android_sdk_ui_release(0);
            }
        });
        this.secondArg$delegate = a.a(new Ia.a<Object>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$secondArg$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Object invoke() {
                return this.this$0.getArg$android_sdk_ui_release(1);
            }
        });
    }

    public static /* synthetic */ StepData copy$default(StepData stepData, JSONObject jSONObject, Channel channel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jSONObject = stepData.srcJson;
        }
        if ((i10 & 2) != 0) {
            channel = stepData.channel;
        }
        return stepData.copy(jSONObject, channel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Object> getArgs() {
        return (List) this.args$delegate.getValue();
    }

    public static /* synthetic */ boolean isArgCountInBounds$default(StepData stepData, int i10, Na.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        if ((i11 & 2) != 0) {
            iVar = null;
        }
        return stepData.isArgCountInBounds(i10, iVar);
    }

    public final BrazeProperties coerceArgToPropertiesOrNull(int i10) {
        Object objQ = q.Q(i10, getArgs());
        if (objQ == null || !(objQ instanceof JSONObject)) {
            return null;
        }
        return new BrazeProperties((JSONObject) objQ);
    }

    public final JSONObject component1() {
        return this.srcJson;
    }

    public final Channel component2() {
        return this.channel;
    }

    public final StepData copy(JSONObject srcJson, Channel channel) {
        i.e(srcJson, "srcJson");
        i.e(channel, "channel");
        return new StepData(srcJson, channel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepData)) {
            return false;
        }
        StepData stepData = (StepData) obj;
        return i.a(this.srcJson, stepData.srcJson) && this.channel == stepData.channel;
    }

    public final Object getArg$android_sdk_ui_release(int i10) {
        return q.Q(i10, getArgs());
    }

    public final Channel getChannel() {
        return this.channel;
    }

    public final Object getFirstArg() {
        return this.firstArg$delegate.getValue();
    }

    public final Object getSecondArg() {
        return this.secondArg$delegate.getValue();
    }

    public final JSONObject getSrcJson() {
        return this.srcJson;
    }

    public int hashCode() {
        return this.channel.hashCode() + (this.srcJson.hashCode() * 31);
    }

    public final boolean isArgCountInBounds(final int i10, final Na.i iVar) {
        if (i10 != -1 && getArgs().size() != i10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData.isArgCountInBounds.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Expected " + i10 + " arguments. Got: " + this.getArgs();
                }
            }, 3, (Object) null);
            return false;
        }
        if (iVar == null || iVar.A(getArgs().size())) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData.isArgCountInBounds.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "Expected " + iVar + " arguments. Got: " + this.getArgs();
            }
        }, 3, (Object) null);
        return false;
    }

    public final boolean isArgOptionalJsonObject(final int i10) {
        Object arg$android_sdk_ui_release = getArg$android_sdk_ui_release(i10);
        if (arg$android_sdk_ui_release == null || (arg$android_sdk_ui_release instanceof JSONObject)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData.isArgOptionalJsonObject.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "Argument [" + i10 + "] is not a JSONObject. Source: " + this.getSrcJson();
            }
        }, 3, (Object) null);
        return false;
    }

    public final boolean isArgString(final int i10) {
        if (getArg$android_sdk_ui_release(i10) instanceof String) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData.isArgString.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "Argument [" + i10 + "] is not a String. Source: " + this.getSrcJson();
            }
        }, 3, (Object) null);
        return false;
    }

    public String toString() {
        return "Channel " + this.channel + " and json\n" + JsonUtils.getPrettyPrintedString(this.srcJson);
    }

    public /* synthetic */ StepData(JSONObject jSONObject, Channel channel, int i10, e eVar) {
        this(jSONObject, (i10 & 2) != 0 ? Channel.UNKNOWN : channel);
    }
}
