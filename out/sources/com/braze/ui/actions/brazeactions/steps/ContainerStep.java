package com.braze.ui.actions.brazeactions.steps;

import Na.l;
import android.content.Context;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.jvm.internal.i;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ContainerStep.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ContainerStep extends BaseBrazeActionStep {
    public static final ContainerStep INSTANCE = new ContainerStep();
    public static final String STEPS = "steps";

    private ContainerStep() {
        super(null);
    }

    public final Iterator getChildStepIterator$android_sdk_ui_release(StepData data) throws JSONException {
        i.e(data, "data");
        final JSONArray jSONArray = data.getSrcJson().getJSONArray(STEPS);
        if (jSONArray != null) {
            return new n.a(new n(SequencesKt___SequencesKt.C(q.H(l.J(0, jSONArray.length())), new Ia.l<Integer, Boolean>() { // from class: com.braze.ui.actions.brazeactions.steps.ContainerStep$getChildStepIterator$$inlined$iterator$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final Boolean invoke(int i10) {
                    return Boolean.valueOf(jSONArray.opt(i10) instanceof JSONObject);
                }

                @Override // Ia.l
                public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                    return invoke(num.intValue());
                }
            }), new Ia.l<Integer, JSONObject>() { // from class: com.braze.ui.actions.brazeactions.steps.ContainerStep$getChildStepIterator$$inlined$iterator$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final JSONObject invoke(int i10) throws JSONException {
                    Object obj = jSONArray.get(i10);
                    if (obj != null) {
                        return (JSONObject) obj;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }

                /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, org.json.JSONObject] */
                @Override // Ia.l
                public /* bridge */ /* synthetic */ JSONObject invoke(Integer num) {
                    return invoke(num.intValue());
                }
            }));
        }
        EmptyList.f42983b.getClass();
        return r.f43021b;
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(StepData data) {
        i.e(data, "data");
        return data.getSrcJson().has(STEPS);
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(Context context, StepData data) throws JSONException {
        i.e(context, "context");
        i.e(data, "data");
        Iterator childStepIterator$android_sdk_ui_release = getChildStepIterator$android_sdk_ui_release(data);
        while (childStepIterator$android_sdk_ui_release.hasNext()) {
            BrazeActionParser.INSTANCE.parse$android_sdk_ui_release(context, StepData.copy$default(data, (JSONObject) childStepIterator$android_sdk_ui_release.next(), null, 2, null));
        }
    }
}
