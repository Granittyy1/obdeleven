package io.intercom.android.sdk.tickets.create.reducers;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.survey.model.SurveyData;

/* JADX INFO: compiled from: CreateTicketReducer.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CreateTicketReducerKt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:105:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:25:0x00db  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:35:0x012e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0137  */
    /* JADX WARN: Code duplicated, block: B:41:0x0140  */
    /* JADX WARN: Code duplicated, block: B:43:0x016f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0179  */
    /* JADX WARN: Code duplicated, block: B:48:0x019c  */
    /* JADX WARN: Code duplicated, block: B:49:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:52:0x01be  */
    /* JADX WARN: Code duplicated, block: B:55:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:56:0x020c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0213  */
    /* JADX WARN: Code duplicated, block: B:61:0x023c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0269  */
    /* JADX WARN: Code duplicated, block: B:71:0x028c  */
    /* JADX WARN: Code duplicated, block: B:78:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:84:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:86:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:89:0x02da  */
    /* JADX WARN: Code duplicated, block: B:91:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:92:0x0334  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String, kotlin.jvm.internal.e] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v25 ??, still in use, count: 2, list:
          (r10v25 ??) from 0x00c5: PHI (r10 I:??) = (r10v1 ??), (r10v25 ??) binds: [B:18:0x00c4, B:101:0x00c5] A[DONT_GENERATE, DONT_INLINE]
          (r10v25 ?? I:??[OBJECT, ARRAY]) from 0x00af: CHECK_CAST (io.intercom.android.sdk.survey.QuestionState) (r10v25 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static final io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel.CreateTicketFormUiState convertToTicketFormUiState(io.intercom.android.sdk.blocks.lib.models.TicketTypeV2 r23, io.intercom.android.sdk.identity.UserIdentity r24, io.intercom.android.sdk.identity.AppConfig r25, io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel.CreateTicketFormUiState r26) {
        /*
            Method dump skipped, instruction units count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.create.reducers.CreateTicketReducerKt.convertToTicketFormUiState(io.intercom.android.sdk.blocks.lib.models.TicketTypeV2, io.intercom.android.sdk.identity.UserIdentity, io.intercom.android.sdk.identity.AppConfig, io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$CreateTicketFormUiState):io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$CreateTicketFormUiState");
    }

    private static final SurveyData.Step.Question.QuestionValidation.ValidationType getInputType(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 96619420) {
            if (iHashCode != 97526364) {
                if (iHashCode == 1958052158 && str.equals(AttributeType.INTEGER)) {
                    return SurveyData.Step.Question.QuestionValidation.ValidationType.INTEGER;
                }
            } else if (str.equals(AttributeType.FLOAT)) {
                return SurveyData.Step.Question.QuestionValidation.ValidationType.FLOAT;
            }
        } else if (str.equals("email")) {
            return SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL;
        }
        return SurveyData.Step.Question.QuestionValidation.ValidationType.TEXT;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final int getPlaceholderText(String str) {
        switch (str.hashCode()) {
            case 3322014:
                if (str.equals(AttributeType.LIST)) {
                    return R.string.intercom_please_select;
                }
                break;
            case 96619420:
                if (str.equals("email")) {
                    return R.string.intercom_placeholder_email_input;
                }
                break;
            case 97526364:
                if (str.equals(AttributeType.FLOAT)) {
                    return R.string.intercom_placeholder_numerical_inputs;
                }
                break;
            case 1958052158:
                if (str.equals(AttributeType.INTEGER)) {
                    return R.string.intercom_placeholder_numerical_inputs;
                }
                break;
        }
        return R.string.intercom_placeholder_text_inputs;
    }
}
