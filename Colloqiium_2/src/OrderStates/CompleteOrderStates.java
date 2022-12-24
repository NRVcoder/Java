package OrderStates;
using Classes;
public class CompleteOrderStates {
    public class CompletedOrder : State
    {
        public override void Cancel()
        {
            throw new NotImplementedException();
        }

        public override void Delete()
        {
            throw new NotImplementedException();
        }

        public override void Pay()
        {
            throw new NotImplementedException();
        }
    }
}
