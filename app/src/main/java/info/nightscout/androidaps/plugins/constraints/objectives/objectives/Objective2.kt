package info.nightscout.androidaps.plugins.constraints.objectives.objectives

import dagger.android.HasAndroidInjector
import info.nightscout.androidaps.R

@Suppress("SpellCheckingInspection")
class Objective2(injector: HasAndroidInjector) : Objective(injector, "exam", R.string.objectives_exam_objective, R.string.objectives_exam_gate) {

    init {
        tasks.add(ExamTask(this, R.string.prerequisites_label, R.string.prerequisites_what, "prerequisites")
            .option(Option(R.string.prerequisites_nightscout, true))
            .option(Option(R.string.prerequisites_computer, true))
            .option(Option(R.string.prerequisites_pump, true))
            .option(Option(R.string.prerequisites_beanandroiddeveloper, false))
            .hint(Hint(R.string.prerequisites_hint1))
        )
        tasks.add(ExamTask(this, R.string.prerequisites2_label, R.string.prerequisites2_what, "prerequisites2")
            .option(Option(R.string.prerequisites2_profile, true))
            .option(Option(R.string.prerequisites2_device, true))
            .option(Option(R.string.prerequisites2_internet, false))
            .option(Option(R.string.prerequisites2_supportedcgm, true))
            .hint(Hint(R.string.prerequisites2_hint1))
        )
        tasks.add(ExamTask(this, R.string.basaltest_label, R.string.basaltest_when, "basaltest")
            .option(Option(R.string.basaltest_fixed, false))
            .option(Option(R.string.basaltest_havingregularhighlow, true))
            .option(Option(R.string.basaltest_weekly, false))
            .option(Option(R.string.basaltest_beforeloop, true))
            .hint(Hint(R.string.basaltest_hint1))
        )
        tasks.add(ExamTask(this, R.string.dia_label_exam, R.string.dia_whatmeansdia, "dia")
            .option(Option(R.string.dia_profile, true))
            .option(Option(R.string.dia_minimumis5h, true))
            .option(Option(R.string.dia_meaningisequaltodiapump, false))
            .option(Option(R.string.dia_valuemustbedetermined, true))
            .hint(Hint(R.string.dia_hint1))
        )
        tasks.add(ExamTask(this, R.string.isf_label_exam, R.string.blank, "isf")
            .option(Option(R.string.isf_decreasingvalue, true))
            .option(Option(R.string.isf_preferences, false))
            .option(Option(R.string.isf_increasingvalue, false))
            .option(Option(R.string.isf_noeffect, false))
            .hint(Hint(R.string.isf_hint1))
            .hint(Hint(R.string.isf_hint2))
        )
        tasks.add(ExamTask(this, R.string.ic_label_exam, R.string.blank, "ic")
            .option(Option(R.string.ic_increasingvalue, true))
            .option(Option(R.string.ic_decreasingvalue, false))
            .option(Option(R.string.ic_multiple, true))
            .option(Option(R.string.ic_isf, false))
            .hint(Hint(R.string.ic_hint1))
        )
        tasks.add(ExamTask(this, R.string.hypott_label, R.string.hypott_whenhypott, "hypott")
            .option(Option(R.string.hypott_preventoversmb, true))
            .option(Option(R.string.hypott_exercise, false))
            .option(Option(R.string.hypott_wrongbasal, false))
            .option(Option(R.string.hypott_0basal, false))
            .hint(Hint(R.string.hypott_hint1))
        )
        tasks.add(ExamTask(this, R.string.profileswitch_label, R.string.profileswitch_pctwillchange, "profileswitch")
            .option(Option(R.string.profileswitch_basallower, true))
            .option(Option(R.string.profileswitch_isfhigher, true))
            .option(Option(R.string.profileswitch_iclower, false))
            .option(Option(R.string.profileswitch_unchanged, false))
            .hint(Hint(R.string.profileswitch_hint1))
        )
        tasks.add(ExamTask(this, R.string.profileswitch2_label, R.string.profileswitch2_pctwillchange, "profileswitch2")
            .option(Option(R.string.profileswitch2_bghigher, false))
            .option(Option(R.string.profileswitch2_basalhigher, true))
            .option(Option(R.string.profileswitch2_bgunchanged, true))
            .option(Option(R.string.profileswitch2_isfhigher, false))
            .hint(Hint(R.string.profileswitch_hint1))
        )
        tasks.add(ExamTask(this, R.string.profileswitchtime_label, R.string.profileswitchtime_iwant, "profileswitchtime")
            .option(Option(R.string.profileswitchtime_2, false))
            .option(Option(R.string.profileswitchtime__2, true))
            .option(Option(R.string.profileswitchtime_tt, false))
            .option(Option(R.string.profileswitchtime_100, false))
            .hint(Hint(R.string.profileswitchtime_hint1))
        )
        tasks.add(ExamTask(this, R.string.profileswitch4_label, R.string.blank, "profileswitch4")
            .option(Option(R.string.profileswitch4_rates, true))
            .option(Option(R.string.profileswitch4_internet, true))
            .option(Option(R.string.profileswitch4_sufficient, false))
            .option(Option(R.string.profileswitch4_multi, true))
            .hint(Hint(R.string.profileswitch_hint1))
        )
        tasks.add(ExamTask(this, R.string.exerciseprofile_label, R.string.exerciseprofile_whattodo, "exercise")
            .option(Option(R.string.exerciseprofile_switchprofileabove100, false))
            .option(Option(R.string.exerciseprofile_switchprofilebelow100, true))
            .option(Option(R.string.exerciseprofile_suspendloop, false))
            .option(Option(R.string.exerciseprofile_leaveat100, false))
            .hint(Hint(R.string.exerciseprofile_hint1))
        )
        tasks.add(ExamTask(this, R.string.exercise_label, R.string.exercise_whattodo, "exercise2")
            .option(Option(R.string.exercise_settt, true))
            .option(Option(R.string.exercise_setfinished, false))
            .option(Option(R.string.exercise_setunchanged, false))
            .option(Option(R.string.exercise_15g, false))
            .hint(Hint(R.string.exercise_hint1))
        )
        tasks.add(ExamTask(this, R.string.noisycgm_label, R.string.noisycgm_whattodo, "noisycgm")
            .option(Option(R.string.noisycgm_nothing, false))
            .option(Option(R.string.noisycgm_pause, true))
            .option(Option(R.string.noisycgm_replacesensor, true))
            .option(Option(R.string.noisycgm_checksmoothing, true))
            .hint(Hint(R.string.noisycgm_hint1))
        )
        tasks.add(ExamTask(this, R.string.pumpdisconnect_label, R.string.blank, "pumpdisconnect")
            .option(Option(R.string.pumpdisconnect_unnecessary, false))
            .option(Option(R.string.pumpdisconnect_missinginsulin, true))
            .option(Option(R.string.pumpdisconnect_notstop, false))
            .option(Option(R.string.pumpdisconnect_openloop, false))
            .hint(Hint(R.string.pumpdisconnect_hint1))
        )
        tasks.add(ExamTask(this, R.string.insulin_label, R.string.insulin_ultrarapid, "insulin")
            .option(Option(R.string.insulin_novorapid, false))
            .option(Option(R.string.insulin_humalog, false))
            .option(Option(R.string.insulin_actrapid, false))
            .option(Option(R.string.insulin_fiasp, true))
            .hint(Hint(R.string.insulin_hint1))
        )
        tasks.add(ExamTask(this, R.string.sensitivity_label, R.string.blank, "sensitivity")
            .option(Option(R.string.sensitivity_adjust, true))
            .option(Option(R.string.sensitivity_edit, false))
            .option(Option(R.string.sensitivity_cannula, true))
            .option(Option(R.string.sensitivity_time, true))
            .hint(Hint(R.string.sensitivity_hint1))
        )
        tasks.add(ExamTask(this, R.string.objectives_label, R.string.objectives_howtosave, "objectives")
            .option(Option(R.string.objectives_notesettings, false))
            .option(Option(R.string.objectives_afterobjective, true))
            .option(Option(R.string.objectives_afterchange, true))
            .option(Option(R.string.objectives_afterinitialsetup, true))
            .hint(Hint(R.string.objectives_hint1))
            .hint(Hint(R.string.objectives_hint2))
        )
        tasks.add(ExamTask(this, R.string.objectives2_label, R.string.objectives_howtosave, "objectives2")
            .option(Option(R.string.objectives2_maintenance, true))
            .option(Option(R.string.objectives2_internalstorage, true))
            .option(Option(R.string.objectives2_cloud, true))
            .option(Option(R.string.objectives2_easyrestore, false))
            .hint(Hint(R.string.objectives_hint1))
            .hint(Hint(R.string.objectives_hint2))
        )
        tasks.add(ExamTask(this, R.string.update_label, R.string.blank, "update")
            .option(Option(R.string.update_git, true))
            .option(Option(R.string.update_askfriend, false))
            .option(Option(R.string.update_keys, true))
            .option(Option(R.string.update_asap, true))
            .hint(Hint(R.string.update_hint1))
        )
        tasks.add(ExamTask(this, R.string.troubleshooting_label, R.string.troubleshooting_wheretoask, "troubleshooting")
            .option(Option(R.string.troubleshooting_fb, true))
            .option(Option(R.string.troubleshooting_wiki, true))
            .option(Option(R.string.troubleshooting_gitter, true))
            .option(Option(R.string.troubleshooting_yourendo, false))
            .hint(Hint(R.string.troubleshooting_hint1))
            .hint(Hint(R.string.troubleshooting_hint2))
            .hint(Hint(R.string.troubleshooting_hint3))
        )
        tasks.add(ExamTask(this, R.string.wrongcarbs_label, R.string.wrongcarbs_whattodo, "wrongcarbs")
            .option(Option(R.string.wrongcarbs_addinsulin, false))
            .option(Option(R.string.wrongcarbs_treatmentstab, true))
            .option(Option(R.string.wrongcarbs_donothing, false))
            .option(Option(R.string.wrongcarbs_bolus, false))
        )
        tasks.add(ExamTask(this, R.string.wronginsulin_label, R.string.wronginsulin_whattodo, "wronginsulin")
            .option(Option(R.string.wronginsulin_careportal, false))
            .option(Option(R.string.wronginsulin_compare, true))
            .option(Option(R.string.wronginsulin_prime, true))
            .option(Option(R.string.wrongcarbs_donothing, false))
        )
        tasks.add(ExamTask(this, R.string.iob_label, R.string.blank, "iob")
            .option(Option(R.string.iob_value, true))
            .option(Option(R.string.iob_hightemp, false))
            .option(Option(R.string.iob_negiob, true))
            .option(Option(R.string.iob_posiob, true))
        )
        tasks.add(ExamTask(this, R.string.breadgrams_label, R.string.blank, "breadgrams")
            .option(Option(R.string.breadgrams_grams, true))
            .option(Option(R.string.breadgrams_exchange, false))
            .option(Option(R.string.breadgrams_decay, true))
            .option(Option(R.string.breadgrams_calc, true))
            .hint(Hint(R.string.breadgrams_hint1))
            )
        tasks.add(ExamTask(this, R.string.extendedcarbs_label, R.string.extendedcarbs_handling, "extendedcarbs")
            .option(Option(R.string.extendedcarbs_future, true))
            .option(Option(R.string.extendedcarbs_free, false))
            .option(Option(R.string.extendedcarbs_fat, true))
            .option(Option(R.string.extendedcarbs_rescue, false))
            .hint(Hint(R.string.extendedcarbs_hint1))
        )
        tasks.add(ExamTask(this, R.string.nsclient_label, R.string.nsclient_howcanyou, "nsclient")
            .option(Option(R.string.nsclient_nightscout, true))
            .option(Option(R.string.nsclient_dexcomfollow, true))
            .option(Option(R.string.nsclient_data, true))
            .option(Option(R.string.nsclient_fullcontrol, false))
            .hint(Hint(R.string.nsclient_hint1))
        )
        tasks.add(ExamTask(this, R.string.other_medication_label, R.string.other_medication_text, "otherMedicationWarning")
            .option(Option(R.string.yes, true))
            .option(Option(R.string.no, false))
        )
        for (task in tasks) (task as ExamTask).options.shuffle()

        for (task in tasks) {
            if (!task.isCompleted()) accomplishedOn = 0
        }
    }
}