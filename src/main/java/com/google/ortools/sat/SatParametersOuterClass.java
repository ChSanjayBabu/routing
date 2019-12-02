package com.google.ortools.sat;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class SatParametersOuterClass {
   static final Descriptor internal_static_operations_research_sat_SatParameters_descriptor;
   static final FieldAccessorTable internal_static_operations_research_sat_SatParameters_fieldAccessorTable;
   private static FileDescriptor descriptor;

   private SatParametersOuterClass() {
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static FileDescriptor getDescriptor() {
      return descriptor;
   }

   static {
      String[] var0 = new String[]{"\n ortools/sat/sat_parameters.proto\u0012\u0017operations_research.sat\"÷6\n\rSatParameters\u0012`\n\u0018preferred_variable_order\u0018\u0001 \u0001(\u000e24.operations_research.sat.SatParameters.VariableOrder:\bIN_ORDER\u0012Y\n\u0010initial_polarity\u0018\u0002 \u0001(\u000e2/.operations_research.sat.SatParameters.Polarity:\u000ePOLARITY_FALSE\u0012\u001e\n\u0010use_phase_saving\u0018, \u0001(\b:\u0004true\u0012 \n\u0015random_polarity_ratio\u0018- \u0001(\u0001:\u00010\u0012 \n\u0015random_branches_ratio\u0018  \u0001(\u0001:\u00010\u0012!\n\u0012use_erwa_heuristic\u0018K \u0001(\b:\u0005false\u0012%\n\u001ainitial_variables_activity\u0018L \u0001(\u0001:\u00010\u00126\n'also_bump_variables_in_conflict_reasons\u0018M \u0001(\b:\u0005false\u0012o\n\u0016minimization_algorithm\u0018\u0004 \u0001(\u000e2D.operations_research.sat.SatParameters.ConflictMinimizationAlgorithm:\tRECURSIVE\u0012\u0082\u0001\n\u001dbinary_minimization_algorithm\u0018\" \u0001(\u000e2@.operations_research.sat.SatParameters.BinaryMinizationAlgorithm:\u0019BINARY_MINIMIZATION_FIRST\u00122\n$subsumption_during_conflict_analysis\u00188 \u0001(\b:\u0004true\u0012$\n\u0015clause_cleanup_period\u0018\u000b \u0001(\u0005:\u000510000\u0012$\n\u0015clause_cleanup_target\u0018\r \u0001(\u0005:\u000510000\u0012k\n\u0019clause_cleanup_protection\u0018: \u0001(\u000e27.operations_research.sat.SatParameters.ClauseProtection:\u000fPROTECTION_NONE\u0012#\n\u0018clause_cleanup_lbd_bound\u0018; \u0001(\u0005:\u00015\u0012g\n\u0017clause_cleanup_ordering\u0018< \u0001(\u000e25.operations_research.sat.SatParameters.ClauseOrdering:\u000fCLAUSE_ACTIVITY\u0012!\n\u0014pb_cleanup_increment\u0018. \u0001(\u0005:\u0003200\u0012\u001d\n\u0010pb_cleanup_ratio\u0018/ \u0001(\u0001:\u00030.5\u00124\n(minimize_with_propagation_restart_period\u0018` \u0001(\u0005:\u000210\u00125\n'minimize_with_propagation_num_decisions\u0018a \u0001(\u0005:\u00041000\u0012$\n\u0017variable_activity_decay\u0018\u000f \u0001(\u0001:\u00030.8\u0012+\n\u001bmax_variable_activity_value\u0018\u0010 \u0001(\u0001:\u00061e+100\u0012\u001f\n\u0011glucose_max_decay\u0018\u0016 \u0001(\u0001:\u00040.95\u0012%\n\u0017glucose_decay_increment\u0018\u0017 \u0001(\u0001:\u00040.01\u0012,\n\u001eglucose_decay_increment_period\u0018\u0018 \u0001(\u0005:\u00045000\u0012$\n\u0015clause_activity_decay\u0018\u0011 \u0001(\u0001:\u00050.999\u0012(\n\u0019max_clause_activity_value\u0018\u0012 \u0001(\u0001:\u00051e+20\u0012S\n\u0012restart_algorithms\u0018= \u0003(\u000e27.operations_research.sat.SatParameters.RestartAlgorithm\u0012e\n\u001adefault_restart_algorithms\u0018F \u0001(\t:ALUBY_RESTART,LBD_MOVING_AVERAGE_RESTART,DL_MOVING_AVERAGE_RESTART\u0012\u001a\n\u000erestart_period\u0018\u001e \u0001(\u0005:\u000250\u0012'\n\u001brestart_running_window_size\u0018> \u0001(\u0005:\u000250\u0012#\n\u0018restart_dl_average_ratio\u0018? \u0001(\u0001:\u00011\u0012$\n\u0019restart_lbd_average_ratio\u0018G \u0001(\u0001:\u00011\u0012#\n\u0014use_blocking_restart\u0018@ \u0001(\b:\u0005false\u0012*\n\u001cblocking_restart_window_size\u0018A \u0001(\u0005:\u00045000\u0012(\n\u001bblocking_restart_multiplier\u0018B \u0001(\u0001:\u00031.4\u00120\n%num_conflicts_before_strategy_changes\u0018D \u0001(\u0005:\u00010\u0012)\n\u001estrategy_change_increase_ratio\u0018E \u0001(\u0001:\u00010\u0012 \n\u0013max_time_in_seconds\u0018$ \u0001(\u0001:\u0003inf\u0012#\n\u0016max_deterministic_time\u0018C \u0001(\u0001:\u0003inf\u00124\n\u0017max_number_of_conflicts\u0018% \u0001(\u0003:\u00139223372036854775807\u0012\u001f\n\u0010max_memory_in_mb\u0018( \u0001(\u0003:\u000510000\u0012-\n\u001ftreat_binary_clauses_separately\u0018! \u0001(\b:\u0004true\u0012\u0016\n\u000brandom_seed\u0018\u001f \u0001(\u0005:\u00011\u0012\"\n\u0013log_search_progress\u0018) \u0001(\b:\u0005false\u0012 \n\u0011use_pb_resolution\u0018+ \u0001(\b:\u0005false\u00126\n'minimize_reduction_during_pb_resolution\u00180 \u0001(\b:\u0005false\u0012,\n\u001ecount_assumption_levels_in_lbd\u00181 \u0001(\b:\u0004true\u0012#\n\u0016presolve_bve_threshold\u00186 \u0001(\u0005:\u0003500\u0012%\n\u001apresolve_bve_clause_weight\u00187 \u0001(\u0005:\u00013\u00125\n)presolve_probing_deterministic_time_limit\u00189 \u0001(\u0001:\u000230\u0012%\n\u0017presolve_blocked_clause\u0018X \u0001(\b:\u0004true\u0012\u001e\n\u0010presolve_use_bva\u0018H \u0001(\b:\u0004true\u0012!\n\u0016presolve_bva_threshold\u0018I \u0001(\u0005:\u00011\u0012#\n\u0017max_presolve_iterations\u0018\u008a\u0001 \u0001(\u0005:\u00013\u0012\u001f\n\u0011cp_model_presolve\u0018V \u0001(\b:\u0004true\u0012!\n\u0016cp_model_probing_level\u0018n \u0001(\u0005:\u00012\u0012'\n\u0019cp_model_use_sat_presolve\u0018] \u0001(\b:\u0004true\u0012)\n\u001aexpand_element_constraints\u0018\u008c\u0001 \u0001(\b:\u0004true\u0012+\n\u001cexpand_automaton_constraints\u0018\u008f\u0001 \u0001(\b:\u0004true\u00123\n\u001bmerge_no_overlap_work_limit\u0018\u0091\u0001 \u0001(\u0001:\r1000000000000\u00120\n\u001cmerge_at_most_one_work_limit\u0018\u0092\u0001 \u0001(\u0001:\t100000000\u0012'\n\u001bpresolve_substitution_level\u0018\u0093\u0001 \u0001(\u0005:\u00010\u0012$\n\u0016use_optimization_hints\u0018# \u0001(\b:\u0004true\u0012\u001b\n\rminimize_core\u00182 \u0001(\b:\u0004true\u0012!\n\u0013find_multiple_cores\u0018T \u0001(\b:\u0004true\u0012 \n\u0012cover_optimization\u0018Y \u0001(\b:\u0004true\u0012x\n\u0018max_sat_assumption_order\u00183 \u0001(\u000e2<.operations_research.sat.SatParameters.MaxSatAssumptionOrder:\u0018DEFAULT_ASSUMPTION_ORDER\u0012/\n max_sat_reverse_assumption_order\u00184 \u0001(\b:\u0005false\u0012|\n\u0016max_sat_stratification\u00185 \u0001(\u000e2D.operations_research.sat.SatParameters.MaxSatStratificationAlgorithm:\u0016STRATIFICATION_DESCENT\u00127\n)use_precedences_in_disjunctive_constraint\u0018J \u0001(\b:\u0004true\u0012<\n-use_overload_checker_in_cumulative_constraint\u0018N \u0001(\b:\u0005false\u0012B\n3use_timetable_edge_finding_in_cumulative_constraint\u0018O \u0001(\b:\u0005false\u0012A\n3use_disjunctive_constraint_in_cumulative_constraint\u0018P \u0001(\b:\u0004true\u0012\u001e\n\u0013linearization_level\u0018Z \u0001(\u0005:\u00011\u0012!\n\u0016boolean_encoding_level\u0018k \u0001(\u0005:\u00011\u0012\u001a\n\fmax_num_cuts\u0018[ \u0001(\u0005:\u00045000\u0012*\n\u001bonly_add_cuts_at_level_zero\u0018\\ \u0001(\b:\u0005false\u0012 \n\u0011add_knapsack_cuts\u0018o \u0001(\b:\u0005false\u0012\u001a\n\u000badd_cg_cuts\u0018u \u0001(\b:\u0005false\u0012\u001a\n\fadd_mir_cuts\u0018x \u0001(\b:\u0004true\u0012!\n\u0015max_all_diff_cut_size\u0018\u0094\u0001 \u0001(\u0005:\u00017\u0012\u001e\n\u0010use_mir_rounding\u0018v \u0001(\b:\u0004true\u0012)\n\u001cmax_integer_rounding_scaling\u0018w \u0001(\u0005:\u0003600\u0012'\n\u0019add_lp_constraints_lazily\u0018p \u0001(\b:\u0004true\u0012/\n$min_orthogonality_for_lp_constraints\u0018s \u0001(\u0001:\u00010\u0012 \n\u0012max_inactive_count\u0018y \u0001(\u0003:\u00041000\u0012*\n\u001dconstraint_removal_batch_size\u0018z \u0001(\u0003:\u0003100\u0012b\n\u0010search_branching\u0018R \u0001(\u000e26.operations_research.sat.SatParameters.SearchBranching:\u0010AUTOMATIC_SEARCH\u0012)\n\u001bexploit_integer_lp_solution\u0018^ \u0001(\b:\u0004true\u0012%\n\u0017exploit_all_lp_solution\u0018t \u0001(\b:\u0004true\u0012%\n\u0015exploit_best_solution\u0018\u0082\u0001 \u0001(\b:\u0005false\u0012 \n\u0011exploit_objective\u0018\u0083\u0001 \u0001(\b:\u0004true\u0012\"\n\u0016probing_period_at_root\u0018\u008e\u0001 \u0001(\u0003:\u00010\u0012.\n!pseudo_cost_reliability_threshold\u0018{ \u0001(\u0003:\u0003100\u0012!\n\u0012optimize_with_core\u0018S \u0001(\b:\u0005false\u0012'\n\u001bbinary_search_num_conflicts\u0018c \u0001(\u0005:\u0002-1\u0012#\n\u0014optimize_with_max_hs\u0018U \u0001(\b:\u0005false\u0012&\n\u0017enumerate_all_solutions\u0018W \u0001(\b:\u0005false\u00122\n\"fill_tightened_domains_in_response\u0018\u0084\u0001 \u0001(\b:\u0005false\u0012'\n\u0019instantiate_all_variables\u0018j \u0001(\b:\u0004true\u00126\n(auto_detect_greater_than_at_least_one_of\u0018_ \u0001(\b:\u0004true\u0012(\n\u0019stop_after_first_solution\u0018b \u0001(\b:\u0005false\u0012\u001d\n\u0012num_search_workers\u0018d \u0001(\u0005:\u00011\u0012!\n\u0011interleave_search\u0018\u0088\u0001 \u0001(\b:\u0005false\u00125\n&reduce_memory_usage_in_interleave_mode\u0018\u008d\u0001 \u0001(\b:\u0004true\u0012-\n\u001ddeterministic_parallel_search\u0018\u0086\u0001 \u0001(\b:\u0005false\u0012$\n\u0016share_objective_bounds\u0018q \u0001(\b:\u0004true\u0012%\n\u0017share_level_zero_bounds\u0018r \u0001(\b:\u0004true\u0012\u001b\n\fuse_lns_only\u0018e \u0001(\b:\u0005false\u0012.\n\u001flns_focus_on_decision_variables\u0018i \u0001(\b:\u0005false\u0012\u001b\n\fuse_rins_lns\u0018\u0081\u0001 \u0001(\b:\u0004true\u0012$\n\u0014diversify_lns_params\u0018\u0089\u0001 \u0001(\b:\u0005false\u0012\u001f\n\u0010randomize_search\u0018g \u0001(\b:\u0005false\u0012)\n\u001esearch_randomization_tolerance\u0018h \u0001(\u0003:\u00010\u0012$\n\u0016use_optional_variables\u0018l \u0001(\b:\u0004true\u0012!\n\u0013use_exact_lp_reason\u0018m \u0001(\b:\u0004true\u0012#\n\u0013use_branching_in_lp\u0018\u008b\u0001 \u0001(\b:\u0005false\u0012'\n\u0017use_combined_no_overlap\u0018\u0085\u0001 \u0001(\b:\u0005false\u0012\"\n\u0013catch_sigint_signal\u0018\u0087\u0001 \u0001(\b:\u0004true\u0012\"\n\u0012use_implied_bounds\u0018\u0090\u0001 \u0001(\b:\u0005false\u0012\u001f\n\rmip_max_bound\u0018| \u0001(\u0001:\b10000000\u0012\u001a\n\u000fmip_var_scaling\u0018} \u0001(\u0001:\u00011\u0012#\n\u0014mip_wanted_precision\u0018~ \u0001(\u0001:\u00051e-06\u0012%\n\u0019mip_max_activity_exponent\u0018\u007f \u0001(\u0005:\u000253\u0012$\n\u0013mip_check_precision\u0018\u0080\u0001 \u0001(\u0001:\u00060.0001\"H\n\rVariableOrder\u0012\f\n\bIN_ORDER\u0010\u0000\u0012\u0014\n\u0010IN_REVERSE_ORDER\u0010\u0001\u0012\u0013\n\u000fIN_RANDOM_ORDER\u0010\u0002\"\u0086\u0001\n\bPolarity\u0012\u0011\n\rPOLARITY_TRUE\u0010\u0000\u0012\u0012\n\u000ePOLARITY_FALSE\u0010\u0001\u0012\u0013\n\u000fPOLARITY_RANDOM\u0010\u0002\u0012\u001a\n\u0016POLARITY_WEIGHTED_SIGN\u0010\u0003\u0012\"\n\u001ePOLARITY_REVERSE_WEIGHTED_SIGN\u0010\u0004\"V\n\u001dConflictMinimizationAlgorithm\u0012\b\n\u0004NONE\u0010\u0000\u0012\n\n\u0006SIMPLE\u0010\u0001\u0012\r\n\tRECURSIVE\u0010\u0002\u0012\u0010\n\fEXPERIMENTAL\u0010\u0003\"à\u0001\n\u0019BinaryMinizationAlgorithm\u0012\u001a\n\u0016NO_BINARY_MINIMIZATION\u0010\u0000\u0012\u001d\n\u0019BINARY_MINIMIZATION_FIRST\u0010\u0001\u00127\n3BINARY_MINIMIZATION_FIRST_WITH_TRANSITIVE_REDUCTION\u0010\u0004\u0012)\n%BINARY_MINIMIZATION_WITH_REACHABILITY\u0010\u0002\u0012$\n EXPERIMENTAL_BINARY_MINIMIZATION\u0010\u0003\"R\n\u0010ClauseProtection\u0012\u0013\n\u000fPROTECTION_NONE\u0010\u0000\u0012\u0015\n\u0011PROTECTION_ALWAYS\u0010\u0001\u0012\u0012\n\u000ePROTECTION_LBD\u0010\u0002\"5\n\u000eClauseOrdering\u0012\u0013\n\u000fCLAUSE_ACTIVITY\u0010\u0000\u0012\u000e\n\nCLAUSE_LBD\u0010\u0001\"\u0086\u0001\n\u0010RestartAlgorithm\u0012\u000e\n\nNO_RESTART\u0010\u0000\u0012\u0010\n\fLUBY_RESTART\u0010\u0001\u0012\u001d\n\u0019DL_MOVING_AVERAGE_RESTART\u0010\u0002\u0012\u001e\n\u001aLBD_MOVING_AVERAGE_RESTART\u0010\u0003\u0012\u0011\n\rFIXED_RESTART\u0010\u0004\"t\n\u0015MaxSatAssumptionOrder\u0012\u001c\n\u0018DEFAULT_ASSUMPTION_ORDER\u0010\u0000\u0012\u001d\n\u0019ORDER_ASSUMPTION_BY_DEPTH\u0010\u0001\u0012\u001e\n\u001aORDER_ASSUMPTION_BY_WEIGHT\u0010\u0002\"o\n\u001dMaxSatStratificationAlgorithm\u0012\u0017\n\u0013STRATIFICATION_NONE\u0010\u0000\u0012\u001a\n\u0016STRATIFICATION_DESCENT\u0010\u0001\u0012\u0019\n\u0015STRATIFICATION_ASCENT\u0010\u0002\"°\u0001\n\u000fSearchBranching\u0012\u0014\n\u0010AUTOMATIC_SEARCH\u0010\u0000\u0012\u0010\n\fFIXED_SEARCH\u0010\u0001\u0012\u0014\n\u0010PORTFOLIO_SEARCH\u0010\u0002\u0012\r\n\tLP_SEARCH\u0010\u0003\u0012\u0016\n\u0012PSEUDO_COST_SEARCH\u0010\u0004\u0012'\n#PORTFOLIO_WITH_QUICK_RESTART_SEARCH\u0010\u0005\u0012\u000f\n\u000bHINT_SEARCH\u0010\u0006B\u001a\n\u0016com.google.ortools.satP\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(var0, new FileDescriptor[0]);
      internal_static_operations_research_sat_SatParameters_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_operations_research_sat_SatParameters_fieldAccessorTable = new FieldAccessorTable(internal_static_operations_research_sat_SatParameters_descriptor, new String[]{"PreferredVariableOrder", "InitialPolarity", "UsePhaseSaving", "RandomPolarityRatio", "RandomBranchesRatio", "UseErwaHeuristic", "InitialVariablesActivity", "AlsoBumpVariablesInConflictReasons", "MinimizationAlgorithm", "BinaryMinimizationAlgorithm", "SubsumptionDuringConflictAnalysis", "ClauseCleanupPeriod", "ClauseCleanupTarget", "ClauseCleanupProtection", "ClauseCleanupLbdBound", "ClauseCleanupOrdering", "PbCleanupIncrement", "PbCleanupRatio", "MinimizeWithPropagationRestartPeriod", "MinimizeWithPropagationNumDecisions", "VariableActivityDecay", "MaxVariableActivityValue", "GlucoseMaxDecay", "GlucoseDecayIncrement", "GlucoseDecayIncrementPeriod", "ClauseActivityDecay", "MaxClauseActivityValue", "RestartAlgorithms", "DefaultRestartAlgorithms", "RestartPeriod", "RestartRunningWindowSize", "RestartDlAverageRatio", "RestartLbdAverageRatio", "UseBlockingRestart", "BlockingRestartWindowSize", "BlockingRestartMultiplier", "NumConflictsBeforeStrategyChanges", "StrategyChangeIncreaseRatio", "MaxTimeInSeconds", "MaxDeterministicTime", "MaxNumberOfConflicts", "MaxMemoryInMb", "TreatBinaryClausesSeparately", "RandomSeed", "LogSearchProgress", "UsePbResolution", "MinimizeReductionDuringPbResolution", "CountAssumptionLevelsInLbd", "PresolveBveThreshold", "PresolveBveClauseWeight", "PresolveProbingDeterministicTimeLimit", "PresolveBlockedClause", "PresolveUseBva", "PresolveBvaThreshold", "MaxPresolveIterations", "CpModelPresolve", "CpModelProbingLevel", "CpModelUseSatPresolve", "ExpandElementConstraints", "ExpandAutomatonConstraints", "MergeNoOverlapWorkLimit", "MergeAtMostOneWorkLimit", "PresolveSubstitutionLevel", "UseOptimizationHints", "MinimizeCore", "FindMultipleCores", "CoverOptimization", "MaxSatAssumptionOrder", "MaxSatReverseAssumptionOrder", "MaxSatStratification", "UsePrecedencesInDisjunctiveConstraint", "UseOverloadCheckerInCumulativeConstraint", "UseTimetableEdgeFindingInCumulativeConstraint", "UseDisjunctiveConstraintInCumulativeConstraint", "LinearizationLevel", "BooleanEncodingLevel", "MaxNumCuts", "OnlyAddCutsAtLevelZero", "AddKnapsackCuts", "AddCgCuts", "AddMirCuts", "MaxAllDiffCutSize", "UseMirRounding", "MaxIntegerRoundingScaling", "AddLpConstraintsLazily", "MinOrthogonalityForLpConstraints", "MaxInactiveCount", "ConstraintRemovalBatchSize", "SearchBranching", "ExploitIntegerLpSolution", "ExploitAllLpSolution", "ExploitBestSolution", "ExploitObjective", "ProbingPeriodAtRoot", "PseudoCostReliabilityThreshold", "OptimizeWithCore", "BinarySearchNumConflicts", "OptimizeWithMaxHs", "EnumerateAllSolutions", "FillTightenedDomainsInResponse", "InstantiateAllVariables", "AutoDetectGreaterThanAtLeastOneOf", "StopAfterFirstSolution", "NumSearchWorkers", "InterleaveSearch", "ReduceMemoryUsageInInterleaveMode", "DeterministicParallelSearch", "ShareObjectiveBounds", "ShareLevelZeroBounds", "UseLnsOnly", "LnsFocusOnDecisionVariables", "UseRinsLns", "DiversifyLnsParams", "RandomizeSearch", "SearchRandomizationTolerance", "UseOptionalVariables", "UseExactLpReason", "UseBranchingInLp", "UseCombinedNoOverlap", "CatchSigintSignal", "UseImpliedBounds", "MipMaxBound", "MipVarScaling", "MipWantedPrecision", "MipMaxActivityExponent", "MipCheckPrecision"});
   }
}