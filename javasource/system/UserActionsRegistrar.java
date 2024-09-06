package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.registerUserAction(bert.actions.KB_Postprocessor.class);
    registrator.registerUserAction(bert.actions.KB_Preprocessor.class);
    registrator.registerUserAction(bert.actions.User_question_post_processor.class);
    registrator.registerUserAction(bert.actions.User_question_pre_processor.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
